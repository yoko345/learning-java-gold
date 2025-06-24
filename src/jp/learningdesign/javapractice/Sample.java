package jp.learningdesign.javapractice;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Sample {
    public static void main(String[] args) throws Exception {
        List<Integer> list = Arrays.asList(5, 8, 2, 9, 3, 1, 10, 7, 6, 4);
        Optional<Integer> result = list.stream().max((a, b) -> {
            if (a < b)
                return -1;
            if (a > b)
                return 1;
            return 0;
        });
        result.ifPresent(System.out::println); // 10
    }
}
