package edu.cnm.deepdive.codingbat;

public class Array2 {

  public int countEvens(int[] nums) {
    int evenCount = 0;
    for (int i = 0; i < nums.length; i++) {
      if (nums[i] % 2 == 0) {
        evenCount++;
      }
      return evenCount;

    }
    return 0; // TODO Compute & return value as specified in https://codingbat.com/prob/p162010.
  }

  public int centeredAverage(int[] nums) {
    return 0; // TODO Compute & return value as specified in https://codingbat.com/prob/p136585.
  }

}
