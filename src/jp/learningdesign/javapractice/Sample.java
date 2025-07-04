package jp.learningdesign.javapractice;

import java.util.HashMap;
import java.util.Map;

public class Sample {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("ONE", 1);
        map.put("TWO", 2);
        map.put("THREE", 3);
        map.keySet().stream().forEach(System.out::println);

        System.out.println("");

        map.entrySet().stream().forEach((Map.Entry<String, Integer> entry) -> {
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println(key + ": " + value);
        });

        System.out.println("");

        Map<String, Integer> mapEntry = Map.ofEntries(Map.entry("FORE", 4), Map.entry("FIVE", 5));
        for (Map.Entry<String, Integer> entry : mapEntry.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
