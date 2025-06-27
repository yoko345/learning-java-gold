package jp.learningdesign.javapractice;

import java.util.Arrays;
import java.util.List;

public class Sample {
    public static void main(String[] args) throws Exception {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
        list.stream()
            .map(x -> x * 3)
            .peek(x -> System.out.println("デバッグ : " + x))
            .filter(x -> x % 2 == 0)
            .forEach(x -> System.out.println("結果 : " + x));
    }
}
