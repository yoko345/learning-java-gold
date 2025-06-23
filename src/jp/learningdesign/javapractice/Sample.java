package jp.learningdesign.javapractice;

import java.util.Arrays;
import java.util.List;

public class Sample {
    public static void main(String[] args) throws Exception {
        List<Value> list = Arrays.asList(
            new Value("A"),
            new Value("B"),
            new Value("C"),
            new Value("A")
        );

        long size = list.stream().distinct().count();
        System.out.println(size);
    }

}
