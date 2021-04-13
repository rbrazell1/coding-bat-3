package edu.cnm.deepdive.codingbat;

public class Array3 {

  public boolean canBalance(int[] nums) {
    boolean balanced = false;
    int firstHalf;
    int lastHalf;
// I need two loops to start on the ends and work my way in checking if they are equal,
// if they meet and are not equal then more to the side that is higher until they are equal,
// if they go past equal then go back, if not equal then return false.
    for (int i = 0; i < nums.length; i++) {

    }

    if (firstHalf == lastHalf) {
      balanced = true;
    }

    return balanced;

  }


}
