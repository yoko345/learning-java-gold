package jp.learningdesign.javapractice;

public class TroubleResource implements AutoCloseable {
    @Override
    public void close() throws Exception {
        throw new RuntimeException("trouble");
    }
}
