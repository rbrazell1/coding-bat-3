package edu.cnm.deepdive.codingbat;

public class Recursion1 {

  public String changeXY(String str) {
    if (!str.isEmpty()) {
      char firstChar = str.charAt(0);
      return ((firstChar == 'x') ? 'y' : firstChar)
          + changeXY(str.substring(1));
    } else {
      return str;
    }
  }
}
