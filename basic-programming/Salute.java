import java.util.Scanner;

public class Salute {
    public static void main(String[] args) {
        Scanner name = new Scanner(System.in);
        String inputName;

        System.out.print("Hello, what's your name: ");
        inputName = name.nextLine();

        System.out.println("Nice to meet you " + inputName);
        System.out.println("Welcome to Java programming");

        name.close();
    }
}
