package edu.cnm.deepdive.codingbat;

import static java.util.Arrays.stream;

public class Array2 {

  public int countEvens(int[] nums) {
    int evenCount = 0;
    for (int i = 0; i < nums.length; i++) {
      if (nums[i] % 2 == 0) {
        evenCount++;
      }
    }
    return evenCount;
  }

  public int centeredAverage(int[] numsC) {
    int mean = 0;
    stream(numsC).sequential() -= numsC[0] - numsC[numsC.length + 1];
    for (int i = 0; i < numsC.length; i++) {
      mean += numsC[i];
    }
    mean /= numsC.length;
    return mean;
  }
}