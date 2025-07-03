package jp.learningdesign.javapractice;

import java.util.ArrayDeque;
import java.util.Deque;

public class Sample {
    public static void main(String[] args) {
        Deque<String> deque = new ArrayDeque<>();
        deque.addLast("A");
        deque.addLast("B");
        deque.addFirst("C");
        deque.addFirst("D");

        deque.stream().forEach(System.out::print); // DCAB
    }
}
