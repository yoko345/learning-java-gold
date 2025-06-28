package jp.learningdesign.javapractice;

import java.io.BufferedReader;
import java.io.Console;
import java.io.IOException;
import java.io.InputStreamReader;

public class Sample {
    public static void main(String[] args) {
        // try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
        // String input = br.readLine();
        // System.out.println(input);
        // } catch (IOException e) {
        // e.printStackTrace();
        // }
        Console console = System.console();
        String str = console.readLine();
        System.out.println(str);
    }
}
