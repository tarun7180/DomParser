package com.tarun.Hackerrank;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class SparseArrays {
  public static void main(String[] args) {

    String[] arr1 = {"abc", "ab", "bc"};
    String[] arr2 = {"abc", "df"};

    matchingStrings(arr1, arr2);
    matchingStrings2(arr1, arr2);

  }

  private static void matchingStrings(final String[] arr1, final String[] arr2) {
    System.out.println("------Java7 way-------");
    Map<String, Integer> stringMap = new HashMap<>();
    for (String string : arr1) {
      if (stringMap.containsKey(string)) {
        int count = stringMap.get(string);
        stringMap.put(string, ++count);
      } else {
        stringMap.put(string, 1);
      }
    }
    for (String query : arr2) {
      System.out.println(stringMap.getOrDefault(query,0));
    }
  }

  private static void matchingStrings2(final String[] arr1, final String[] arr2) {
    System.out.println("------Using Java streams-------");
    Arrays.stream(arr2)
        .mapToLong(s -> Arrays.stream(arr1).filter(s::equals).count())
        .forEach(System.out::println);
  }

}
