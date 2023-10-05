import java.util.Scanner;

public class LeapYear {
    public static void main(String args[]) {
        Scanner year = new Scanner(System.in);

        int leap = 0;
        boolean isLeapYear = false;

        System.out.println("Leap-year");

        System.out.print("Enter a year: ");
        leap = year.nextInt();

        if (leap % 4 == 0) {
            if (leap % 100 == 0) {
                if (leap % 400 == 0) {
                    isLeapYear = true;
                    // System.out.println(leap + " is a leap-year");
                }
            } else {
                isLeapYear = true;
            }
        } 

        if (isLeapYear) {
            System.out.println(leap + " is a leap-year");
        } else {
            System.out.println(leap + " is  not a leap-year");
        }

        year.close();
    }
}