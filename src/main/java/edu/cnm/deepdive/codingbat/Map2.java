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
    map.replace("ice cream", "cherry");
    map.replace("bread", "butter");
    map.putIfAbsent("bread", "butter");
    return map;
  }

  public Map<String, String> topping2(Map<String, String> map) {
    if (map.containsKey("ice cream")) {
      map.putIfAbsent("yogurt", map.get("ice cream"));
    }
    map.replace("spinach", "nuts");
    return map;

  }

  public Map<String, String> topping3(Map<String, String> map) {
    if (map.containsKey("potato")) {
      map.putIfAbsent("fries", map.get("potato"));
    }
    if (map.containsKey("salad")) {
      map.putIfAbsent("spinach", map.get("salad"));
    }
    return map;
  }

  public Map<String, String> mapAB(Map<String, String> map) {


    return map;
  }

}
