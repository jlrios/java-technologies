import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String args[]) {
        Scanner number = new Scanner(System.in);

        int multiply;

        System.out.println("Generate multiplication table");

        System.out.print("Enter number between 2 and 10: ");
        multiply = number.nextInt();

        System.out.println("- - - - - - - - - - - - - -");
        System.out.println("Multiplication table of " + multiply);
        System.out.println("= = = = = = = = = = = = = =");

        for (int m = 1; m <= 10; m++) {
            System.out.println("\t" + multiply + " * " + m + " = " + (multiply * m));
        }

        System.out.println("- - - - - - - - - - - - - -");

        number.close();
    }
}
