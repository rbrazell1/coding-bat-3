package edu.cnm.deepdive.codingbat;

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
    int smallest = Integer.MAX_VALUE;
    int largest = Integer.MIN_VALUE;
    int sum = 0;
    for (int value : numsC) {
      sum += value;
      if (value > largest) {
        largest = value;
      }
      if (value < smallest) {
        smallest = value;
      }
    }
    sum -= smallest + largest;
    return sum / (numsC.length - 2);
  }
}