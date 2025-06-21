package jp.learningdesign.javapractice;

public class Sample {
    public static void main(String[] args) {
        // Thread t = new SampleThread();
        // Thread t = new Thread(new Runnable() {
        // @Override
        // public void run() {
        // System.out.println("sub");
        // }
        // });
        Thread t = new Thread(() -> System.out.println("sub"));

        t.start();

        System.out.println("main");
    }
}
