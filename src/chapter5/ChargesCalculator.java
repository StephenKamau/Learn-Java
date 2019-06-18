package chapter5;

import java.util.Scanner;

public class ChargesCalculator {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        double planFee = getPlanFee();
        int overage = getNumberOfOverageMinutes();
        double overageCharges = calculateOverageFees(overage);
        double taxCharges = calculateTax(overageCharges, planFee);
        double totalCharges = calculateTotalCharges(taxCharges, overageCharges, planFee);

        //display the output
        System.out.println("Phone Bill Statement");
        System.out.println("Plan: $" + planFee);
        System.out.println("Overage: $" + overageCharges);
        System.out.println("Tax: $" + taxCharges);
        System.out.println("Total: $" + totalCharges);
    }

    //get the plan fee
    public static double getPlanFee() {
        System.out.println("Enter base cost of the plan:");
        return scanner.nextDouble();
    }

    //get overage minutes
    public static int getNumberOfOverageMinutes() {
        System.out.println("Enter overage minutes:");
        return scanner.nextInt();
    }

    public static double calculateTax(double overageFees, double planFee) {
        double rateTax = 0.15;
        return rateTax * (overageFees + planFee);
    }

    public static double calculateOverageFees(int numberOfOverageMinutes) {
        double rateForOverage = 0.25;
        return numberOfOverageMinutes * rateForOverage;
    }

    public static double calculateTotalCharges(double taxCharged, double overageFees, double planFee) {
        return taxCharged + overageFees + planFee;
    }
}
