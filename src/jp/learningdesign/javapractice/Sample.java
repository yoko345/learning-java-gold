package jp.learningdesign.javapractice;

import java.util.Optional;

public class Sample {
    public static void main(String[] args) throws Exception {
        Optional<String> sample = Optional.of("sample");
        Optional<String> result = sample.flatMap(str -> test(str));
        System.out.println(result.get()); // SAMPLE
    }

    private static Optional<String> test(String str) {
        return Optional.of(str.toUpperCase());
    }
}
