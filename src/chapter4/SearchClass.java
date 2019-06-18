package chapter4;

import java.util.Scanner;

public class SearchClass {
    public static void main(String[] args) {
        //get the text
        System.out.print("Enter the string: ");
        Scanner scanner = new Scanner(System.in);
        String text = scanner.next();

        //search for a character
        boolean isFound = false;
        char searchCharCaps = 'A';
        char searchCharSmall = 'a';
        for (int i = 0; i < text.length(); i++) {
            char currentChar = text.charAt(i);
            if (currentChar == searchCharCaps || currentChar == searchCharSmall) {
                isFound = true;
                break;
            } else {
                isFound = false;
            }
        }

        if (isFound) {
            System.out.println("The string contains the character [" + searchCharSmall + "]");
        } else{
            System.out.println("The string does not contain the character [" + searchCharSmall + "]");
        }
    }
}
