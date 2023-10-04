import java.util.Scanner;

public class SquareCube {
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
        
        int  squareCube = 0, square = 0;

        System.out.println("The square and the cube of a number");

        System.out.print("Input a number: ");
        squareCube = number.nextInt();
        
        square = squareCube * squareCube;
        
        System.out.println("The square of " + squareCube + ": " + square);
        System.out.println("The cube of: " + squareCube + ": " + (square * squareCube));
        
        number.close();
    }
}
