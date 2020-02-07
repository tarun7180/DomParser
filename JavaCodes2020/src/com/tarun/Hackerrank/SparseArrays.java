package com.tarun.Hackerrank;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class SparseArrays {
  public static void main(String[] args) {

    String[] strings = {"abc", "ab", "bc"};
    String[] queries = {"abc", "df"};

    matchingStrings(strings, queries);
    matchingStrings2(strings, queries);

  }

  private static void matchingStrings(final String[] strings, final String[] queries) {
    System.out.println("------Java7 way-------");
    Map<String, Integer> stringMap = new HashMap<>();
    for (String string : strings) {
      if (stringMap.containsKey(string)) {
        int count = stringMap.get(string);
        stringMap.put(string, ++count);
      } else {
        stringMap.put(string, 1);
      }
    }
    for (String query : queries) {
      System.out.println(stringMap.getOrDefault(query,0));
    }
  }

  private static void matchingStrings2(final String[] strings, final String[] queries) {
    System.out.println("------Using Java streams-------");
    Arrays.stream(queries)
        .mapToLong(s -> Arrays.stream(strings).filter(s::equals).count())
        .forEach(System.out::println);
  }

}
