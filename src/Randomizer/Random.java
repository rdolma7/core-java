package Randomizer;

import java.util.Scanner;

public class Random {
    public static void main(String[] args) {
        //First  way of generating random number between 1 -95.
        System.out.println((int) (Math.random() * 95) + 1);
        //   System.out.println((int)(Math.random() * 95) + 1);
        // Second way of generating random number between 1 - 95.
        int min = 1;
        int max = 95;
        System.out.println((int) (Math.random() * 95) + 1);
// Third way of generating random number with user interactivity with if condition.
        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter minimum and maximum numbers to get a random number between them. ");
        int minNum = userInput.nextInt();
        int maxNum = userInput.nextInt();
        if (minNum > maxNum) {
            System.out.println("Minimum number cannot be bigger than maximum  number. Please try again.");
        } else {
            System.out.println((int) (Math.random() * maxNum) + minNum);
        }
        // Fourth way is with a for loop.

        }
    }