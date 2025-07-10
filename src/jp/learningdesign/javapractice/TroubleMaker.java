package jp.learningdesign.javapractice;

public class TroubleMaker {
    public static void main(String[] args) {
        try (TroubleResource resource = new TroubleResource()) {
            throw new Exception();
        } catch (RuntimeException e) {
            System.out.println("A");
        } catch (Exception e) {
            for (Throwable t : e.getSuppressed()) {
                System.out.println(t);
            }
            System.out.println("B");
        }
    }
}
