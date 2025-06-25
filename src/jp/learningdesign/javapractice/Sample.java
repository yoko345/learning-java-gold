package jp.learningdesign.javapractice;

import java.util.Arrays;
import java.util.List;

public class Sample {
    public static void main(String[] args) throws Exception {
        List<String> list = Arrays.asList("a", "b", "c", "d", "e");
        String result = list.stream().collect(new SampleCollector());
        System.out.println(result); // A, B, C, D, E
    }
}
