package chapter3;

import java.util.Scanner;

public class QuotaCalculator {
    public static void main(String[] args) {
        //initialize known values
        int quota = 10;

        //ask for unknown values
        System.out.print("Enter your sales: ");
        Scanner scanner = new Scanner(System.in);
        int sales = scanner.nextInt();
        scanner.close();

        //check for sales target
        if (sales >= quota) {
            System.out.println("Congratulations! You have met your quota.");
        } else if (sales < quota) {
            //calculate the missed target
            int salesShort = quota - sales;
            System.out.println("You missed your quota by " + salesShort + " sales");
        }
    }
}
