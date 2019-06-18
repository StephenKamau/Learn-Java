package chapter2;

import java.util.Scanner;

public class MadLibs {
    public static void main(String[] args) {
        //Ask for the season
        System.out.print("Enter the season: ");
        Scanner scanner = new Scanner(System.in);
        String season = scanner.next();
        //Ask for the whole number
        System.out.print("Enter a whole number: ");
        int numberOfCups = scanner.nextInt();
        //Ask for the adjective
        System.out.print("Enter your adjective: ");
        String adjective = scanner.next();
        scanner.close();
        String message = "On a " + adjective + " " + season + " day, I drink a minimum of " + numberOfCups + " cups of coffee.";
        //Output the message
        System.out.println(message);
    }
}
