from __future__ import division
def sqrt(guess, x):
    if abs(guess * guess - x) > 0.001:
        return sqrt((guess + x / guess)/2, x)
    else:
        return guess

if __name__ == '__main__':
    print sqrt(1, 4)
