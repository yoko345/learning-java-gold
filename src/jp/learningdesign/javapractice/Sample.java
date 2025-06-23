package jp.learningdesign.javapractice;

import java.util.List;

public class Sample {
    public static void main(String[] args) throws Exception {
        List<Integer> list = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        for (int i = 0; i < 5; i++) {
            list.parallelStream().findAny().ifPresent(System.out::print);
            System.out.print(", ");
            list.parallelStream().findFirst().ifPresent(System.out::println);
        }

        list.parallelStream().filter(x -> {
            System.out.println(x + " : " + (x % 2 == 0));
            return x % 2 == 0;
        }).findFirst().ifPresent(System.out::println);
    }

}
