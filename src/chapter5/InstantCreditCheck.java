package chapter5;

import java.util.Scanner;

public class InstantCreditCheck {
    //initialize what we know
    static int requiredSalary = 2000;
    static int requiredCreditScore = 700;
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        //check whether the user is qualified
        double salary = getSalary();
        int creditScore = getCreditScore();
        boolean isQualified = isQualified(salary,creditScore);
        notifyUser(isQualified);
    }

    public static double getSalary() {
        System.out.print("Enter salary: ");
        return scanner.nextDouble();
    }

    public static int getCreditScore() {
        System.out.print("Enter credit score: ");
        return scanner.nextInt();
    }

    public static boolean isQualified(double salary, int creditScore) {
        if (salary >= requiredSalary && creditScore >= requiredCreditScore)
            return true;
        else {
            return false;
        }
    }

    public static void notifyUser(boolean isQualified) {
        if (isQualified)
            System.out.println("Congrats! You have been approved.");
        else {
            System.out.println("Sorry you dont qualify");
        }
    }
}
