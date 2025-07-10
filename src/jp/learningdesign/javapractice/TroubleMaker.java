package jp.learningdesign.javapractice;

public class TroubleMaker {
    public static void main(String[] args) {
        try (TroubleResource resource = new TroubleResource()) {
            throw new Exception();
        } catch (RuntimeException e) {
            System.out.println("A");
        } catch (Exception e) {
            System.out.println("B");
        }
    }
}
