package ro.sci.tema01;

import java.util.Scanner;

public class Main {
}
import java.util.Scanner;

public class PrimeNumberVerification {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter a integer number you want to verify if it is a prime number!");
        int number = scanner.nextInt();

        if (isPrimeNumber(number)) {
            System.out.println(number + " is a prime number");
        } else {
            System.out.println(number + " is not a prime number");
        }
    }

    public static boolean isPrimeNumber(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}