// package codenomads.examples;

import java.util.Random;
import java.util.Scanner;

public class GuessMyNumber {
    public static void main(String[] args) {
        Random random = new Random();
        int num = random.nextInt(10);

        boolean continuePlaying = true;

        System.out.println("Welcome to GUESS MY NUMBER!");

        while (continuePlaying) {

            System.out.println("Please enter a number between 1 and 10.");
            Scanner scanner = new Scanner(System.in);
            int guess = scanner.nextInt();

            if (guess == num) {
                System.out.println("You win! " + guess + " was the number.");
                continuePlaying = false;
            }

            else if (guess > num) {
                System.out.println("Sorry. Your guess " + guess + " is too high.");
            }
            else if (guess < num) {
                System.out.println("Sorry. Your guess " + guess + " is too low.");
            }
        }
    }
}

