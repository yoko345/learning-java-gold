package jp.learningdesign.javapractice;

import java.util.Optional;

public class Sample {
    public static void main(String[] args) throws Exception {
        Optional<String> sample = Optional.empty();
        System.out.println(sample.orElseThrow(() -> new Exception()));
    }
}
