package jp.learningdesign.javapractice;


public class Sample {
    public static void main(String[] args) {
        Test<?> test = new Test<>("Hello");
        String msg = (String) test.getValue();
        // String msg = test.getValue(); // コンパイルエラー
        // test.setValue("samlpe"); // コンパイルエラー
        // test.setValue(new Object()); // コンパイルエラー
        test.setValue(null);
    }
}
