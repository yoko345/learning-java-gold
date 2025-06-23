package jp.learningdesign.javapractice;

import java.util.Arrays;
import java.util.List;

public class Sample {
    public static void main(String[] args) throws Exception {
        List<Integer> list = Arrays.asList(5, 8, 2, 9, 3, 1, 10, 7, 6, 4);
        list.stream().sorted((a, b) -> {
            if (a < b)
                return -1;
            if (a > b)
                return 1;
            return 0;
        }).forEach(val -> System.out.printf("%d, ", val));
    }
}
