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

//  MAP1

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
    if (map.containsKey("a") && map.containsKey("b")) {
      map.put("ab", map.get("a") + map.get("b"));
    }
    return map;
  }

  public Map<String, String> mapAB2(Map<String, String> map) {
    if (map.containsKey("a") && map.containsKey("b") &&
        (map.get("a")
            .equals(map.get("b")))) {
      map.remove("a");
      map.remove("b");
    }
    return map;
  }

  public Map<String, String> mapAB3(Map<String, String> map) {
    if (map.containsKey("a") || map.containsKey("b")) {
      map.putIfAbsent("a", map.get("b"));
      map.putIfAbsent("b", map.get("a"));
    }
    return map;
  }

  public Map<String, String> mapAB4(Map<String, String> map) {
    if (map.containsKey("a") && map.containsKey("b")) {
      if (map.get("a")
             .length() == map.get("b")
                             .length()) {
        map.put("a", "");
        map.put("b", "");
      } else {
        map.replace("c",
            map.get("a")
               .length() > map.get("b")
                              .length()
                ? map.get("a")
                : map.get("b"));

        map.putIfAbsent("c",
            map.get("a")
               .length() > map.get("b")
                              .length()
                ? map.get("a")
                : map.get("b"));
      }
    }
    return map;
  }

  public Map<String, String> mapBully(Map<String, String> map) {

    return map;
  }

}
