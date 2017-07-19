package main;

import java.util.Scanner;

public class PerfectNumber {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner (System.in);

        System.out.println("Enter lower boundary number: ");
        int startingNumber = keyboard.nextInt();

        System.out.println("Enter upper boundary number: ");
        int endingNumber = keyboard.nextInt();

        System.out.println("Looking for Perfect Numbers between " +startingNumber + " and " +endingNumber);

        if(startingNumber % 2 != 0) {
            startingNumber = startingNumber + 1;
        }

        for (int i = startingNumber; i <= endingNumber; i+=2) {
            if (i % 10 == 6 || i % 10 == 8) {
                if (isPerfectNumber(i)) {
                    System.out.println(i + " is a perfect number");
                }
            }
        }

    }
    public static boolean isPerfectNumber(int number) {
        int sum=0;
        for(int i=1; i<=number/2; i++) {
            if(number%i == 0) {
                sum += i;
            }
        }

        if(sum==number) {
            return true;
        } else {
            return false;
        }
    }
}
