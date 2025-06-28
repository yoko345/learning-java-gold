package jp.learningdesign.javapractice;

import java.io.File;
import java.io.FileFilter;

public class Sample {
    public static void main(String[] args) throws Exception {
        File rootDir = new File("./src/jp/learningdesign/javapractice");
        FileFilter filter = (path) -> {
            if (path.isDirectory() || path.getName().startsWith("Sample")) {
                return true;
            }
            return false;
        };

        showTree(rootDir, filter);
    }

    private static void showTree(File dir, FileFilter filter) {
        File[] files = dir.listFiles(filter);
        for (File file : files) {
            System.out.println(file);
            if (file.isDirectory()) {
                showTree(dir, filter);
            }
        }
    }
}
