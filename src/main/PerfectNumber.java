package main;

import java.util.ArrayList;
import java.util.Scanner;

public class PerfectNumber {

    public static int startingNumber, endingNumber;
    public static ArrayList<Integer> perfectNumbers;

    public static void main(String[] args) {

        Scanner keyboard = new Scanner (System.in);

        System.out.println("Enter lower boundary number: ");
        startingNumber = keyboard.nextInt();

        System.out.println("Enter upper boundary number: ");
        endingNumber = keyboard.nextInt();

        System.out.println("Looking for Perfect Numbers between " +startingNumber + " and " +endingNumber);
        perfectNumbers = validatePerfectNumber(startingNumber, endingNumber);
    }

    public static ArrayList<Integer> validatePerfectNumber(int startingNumber, int endingNumber) {

        if(startingNumber % 2 != 0) {
            startingNumber = startingNumber + 1;
        }

        ArrayList<Integer> perfectno = new ArrayList<>();
        for (int i = startingNumber; i <= endingNumber; i+=2) {
            if (i % 10 == 6 || i % 10 == 8) {
                if (isPerfectNumber(i)) {
                    perfectno.add(i);
                    System.out.println(i + " is a perfect number");
                }
            }
        }
        return perfectno;
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
