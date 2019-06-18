package chapter4;

import java.util.Random;

public class RandomGame {
    public static void main(String[] args) {
        //initialize known variables
        int gameBoardSpaces = 20;
        int limit = 5;
        int currentPosition = 0;
        int spacesLeft;

        //generate random dice rolls
        Random random = new Random();
        for (int i = 1; i <= limit; i++) {
            int die = random.nextInt(6) + 1;
            currentPosition += die;
            spacesLeft = gameBoardSpaces - currentPosition;
            if (currentPosition == gameBoardSpaces) {
                System.out.println("Roll #" + i + ": You've rolled a " + die + ". You're on space "
                        + currentPosition + ". Congrats, you win!");
                break;
            } else if (currentPosition > gameBoardSpaces) {
                System.out.println("Unfortunately, that takes you past " + gameBoardSpaces + " spaces. You lose!");
                break;
            } else if (i == limit && currentPosition < gameBoardSpaces) {
                System.out.println("You're on space " + currentPosition + ".");
                System.out.println("Unfortunately, you didn't make it to all " +
                        gameBoardSpaces + " spaces. You lose!");
            } else {
                System.out.println("Roll #" + i + ": You've rolled a " + die + ". You are now on space "
                        + currentPosition + " and have " + spacesLeft + " more to go.");
            }
        }
    }
}
