package edu.cnm.deepdive.codingbat;

import java.util.List;

public class Functional2 {
  public List<Integer> noTeen(List<Integer> nums) {
    nums.removeIf((teen) -> teen <= 19 && teen >= 13);
    return nums;
  }
}
