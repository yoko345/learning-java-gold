package jp.learningdesign.javapractice;

import java.io.File;

public class Sample {
    public static void main(String[] args) throws Exception {
        File rootDir = new File(".");
        File[] files = rootDir.listFiles();
        for (File file : files) {
            System.out.println(file);
        }

        System.out.println("");

        String[] fileList = rootDir.list();
        for (String file : fileList) {
            System.out.println(file);
        }
    }
}
