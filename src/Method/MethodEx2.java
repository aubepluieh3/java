package Method;

public class MethodEx2 {
    public static void main(String[] args) {
        message(3);
        message(5);
        message(7);

    }

    public static void message (int j) {
        String message = "Hello, world!";
        for (int i = 0; i< j; i++) {
            System.out.println(message);
        }
    }
}
