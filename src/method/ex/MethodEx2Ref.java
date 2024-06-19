package method.ex;

public class MethodEx2Ref {

    public static void main(String[] args) {
        String message = "Hello, world!";

        printRepeat(message, 3);
        printRepeat(message, 5);
        printRepeat(message, 7);
    }

    public static void printRepeat(String message, int a) {
        for (int i = 0; i < a; i++) {
            System.out.println(message);
        }
    }
}
