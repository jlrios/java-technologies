import java.util.Scanner;

public class SumOfNumbers {
    public static void main(String args[]) {
        Scanner number = new Scanner(System.in);

        int sumNumber;
        int sumResult = 0;

        System.out.println("Sum of numbers");   

        System.out.print("Enter a number between 1 and 10 including them: ");
        sumNumber = number.nextInt();

        for (int n = 1; n <= sumNumber; n++) {
            sumResult += n; 
        }

        System.out.print("Sum of numbers between 1 and " + sumNumber + ": ");
        System.out.println(sumResult);

        number.close();
    }
}
