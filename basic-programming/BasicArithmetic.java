import java.util.Scanner;

public class BasicArithmetic {

    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
        
        int firstNumber;
        int secondNumber;

        // Variables of the same type, can also be declared on a single line.
        // int firstNumber, secondoNumber;

        System.out.print("Basic Arithmetic operations");

        System.out.print("\nEnter first number: ");
        firstNumber = number.nextInt();

        System.out.print("Enter second number: ");
        secondNumber = number.nextInt();

        System.out.println("Add of " + firstNumber + " + " + secondNumber + " = " + (firstNumber + secondNumber));
        System.out.println("Subtract of " + firstNumber + " - " + secondNumber + " = " + (firstNumber - secondNumber));
        System.out.println("Multiply of " + firstNumber + " * " + secondNumber + " = " + (firstNumber * secondNumber));
        System.out.println("Divide of " + firstNumber + " / " + secondNumber + " = " + (firstNumber / secondNumber));        

        number.close();
    }
}