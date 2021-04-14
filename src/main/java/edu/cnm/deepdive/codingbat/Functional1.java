package edu.cnm.deepdive.codingbat;

import java.util.List;
import java.util.stream.Collectors;

public class Functional1 {

  public List<String> copies3(List<String> strings) {
   strings = strings.stream()
       .map((multi) -> multi + multi + multi)
       .collect(Collectors.toList());
   return strings;
  }
}
