### Spring MVC 集成 Swagger

Swagger 是一个API文档生成工具，它支持各种语言，甚至支持在线运行实例，本示例基于 HelloWorld-MVC 修改得到。

#### 引入特定的依赖 JAR 包
 pom.xml 中添加如下依赖:
 ```
 ```
 最主要的是 swagger-springmvc 依赖，添加了它之后，我们可以使用 Swagger 特定的注解。Swagger 会查找自己的以及 Spring 特定的注解，这样默认可以直接使用 <http://host:port/projectName/api-docs>获取所有WEB层的API接口（以JSON格式返回）。
 swagger-spring-mvc-ui依赖是可选的，它集成的是Swagger-ui, 可以通过页面展示API文档，因为 Maven 中央仓库没有此依赖，可使用如下仓库。
 ```
<repository>
<id>oss-jfrog-artifactory</id>
<name>oss-jfrog-artifactory-releases</name>
<url>http://oss.jfrog.org/artifactory/oss-release-local</url>
</repository>
 ```
 
 #### 添加Swagger配置
 这里使用 JavaConfig 的方法配置Swagger, 配置类为 SwaggerConfig
 ```
 ```
 
 
 