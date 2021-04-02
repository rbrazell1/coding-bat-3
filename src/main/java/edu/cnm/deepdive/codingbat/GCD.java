package edu.cnm.deepdive.codingbat;

public class GCD {

  public static long findGCD(long a, long b) {
    if (b == 0) {
      return a;
    }
    return findGCD(b, a%b);
  }
}
