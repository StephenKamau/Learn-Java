package chapter3;

import java.util.Scanner;

/*
Calculates salary after checking sales for bonuses
 */
public class SalaryCalculator {
    public static void main(String[] args) {
        //initialize known values
        int salary = 1000;
        int bonus = 250;
        int quota = 10;

        //get values for unknown values
        System.out.print("Enter employee sales for the week: ");
        Scanner scanner = new Scanner(System.in);
        int sales = scanner.nextInt();
        scanner.close();

        //logic for gross salary
        if (sales > quota) {
            salary += bonus;
        }

        //output the salary
        System.out.println("Salary is: $" + salary);
    }
}
