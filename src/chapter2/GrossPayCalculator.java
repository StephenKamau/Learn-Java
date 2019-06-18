package chapter2;

import java.util.Scanner;

public class GrossPayCalculator {
    public static void main(String[] args) {
        //1.Get the number of hours worked
        System.out.print("Enter the number of hours worked: ");
        Scanner scanner = new Scanner(System.in);
        int hours = scanner.nextInt();
        //2.Get hourly pay
        System.out.print("Enter the pay rate: ");
        double rate = scanner.nextDouble();
        scanner.close();
        //3.Multiply hours and pay
        double grossPay = hours * rate;
        //4.Display the result
        System.out.println("The employee's pay is : $"+grossPay);
    }
}
