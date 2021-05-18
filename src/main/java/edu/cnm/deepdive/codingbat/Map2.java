package edu.cnm.deepdive.codingbat;

import java.util.HashMap;
import java.util.Map;

public class Map2 {

  public Map<String, Integer> wordCount(String[] strings) {
    Map<String, Integer> map = new HashMap<>(strings.length);
    for (int i = 0; i < strings.length; i++) {
      String key = strings[i];
      int value = map.getOrDefault(key, 0);
      map.put(key, ++value);
    }
    return map;
  }

  public Map<String, String> topping1(Map<String, String> map) {
    return null;
  }

}
