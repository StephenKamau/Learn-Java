package chapter4;

import java.util.Scanner;

public class InputValidation {
    public static void main(String[] args) {
        //initialize known variables
        int rate = 15;
        int maxHours = 40;

        //ask for unknown variables
        System.out.print("Enter hours worked: ");
        Scanner scanner = new Scanner(System.in);
        int hoursWorked = scanner.nextInt();

        //validate the input
        while (hoursWorked>maxHours){
            System.out.println("Invalid entry! allowed 1-40");
            hoursWorked = scanner.nextInt();
            scanner.close();
        }
    }
}
