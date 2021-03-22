package edu.cnm.deepdive.codingbat;

public class Custom {

  public int sumMultiples(int limitNum, int div1, int div2) {
    int sum = 0;
    for (int i = 1; i < limitNum ; i++) {
      if (i % div1 == 0 || i % div2 == 0) {
        sum += i;
      }
    }
    return sum;
  }
}
