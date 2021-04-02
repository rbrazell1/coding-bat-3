package edu.cnm.deepdive.codingbat;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArraySlice {

  int[] fullArray ={1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};

  public static int[] sliceArray(int[] partOfArray, int startOfSlice, int endOfSlice, int stride) {
    List<Integer> integerList = new ArrayList<>();
// To go negative switch
    for (int i = startOfSlice; i < endOfSlice; i += stride) {
      integerList.add(partOfArray[i]);
    }

    int[] fullArray = new int[integerList.size()];
    for (int i = 0; i < fullArray.length; i++) {
      fullArray[i] = integerList.get(i);
    }
    return fullArray;
  }

}
