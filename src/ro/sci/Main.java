package ro.sci;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
//
//        int number = scanner.nextInt();
//
//        if (number % 3 == 0) {
//            System.out.println("Numarul " + number + " este de forma 3k");
//        } else if (number % 3 == 1) {
//            System.out.println("Numarul " + number + " este de forma 3k+1");
//        } else {
//            System.out.println("Numarul " + number + " este de forma 3k+2");
//        }
//
//        String baseResult = "Numarul " + number + " este ";

//        String postfix = "";
//        if (number % 2 == 0) {
//            postfix = "par";
//        } else {
//            postfix = "impar";
//        }

//        String postfix = (number % 2 == 0) ? "par" : "impar";
//
//        System.out.println(baseResult + postfix);

        /*
        Switch
         */

//        double firstNumber = scanner.nextDouble();
//        double secondNumber = scanner.nextDouble();
//        String operand = scanner.next();
//
//        double calculationResult = 0;
//        switch (operand) {
//            case "+" :
//                calculationResult = firstNumber + secondNumber;
//                break;
//            case "-" :
//                calculationResult = firstNumber - secondNumber;
//                break;
//            case "*" :
//                calculationResult = firstNumber * secondNumber;
//                break;
//            case "/" :
//                calculationResult = firstNumber / secondNumber;
//                break;
//            default :
//                System.out.println("Operation not supported!");
//        }
//
//        System.out.println("Rezultatul este " + calculationResult);

    /*
    for
     */
        for (int i = 0; i < 101; i++) {
            System.out.println("Step " + i);
            if (i % 2 == 0) {
                System.out.println("Even number");
            }
        }

        int [] numbers = new int [] {1, 3, 6, 4};
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Number is " + numbers[i]);
        }

        for (int number : numbers)
        {
            System.out.println("Number is " + number);
        }

        for (int i = 0; i < 101; i++) {
            System.out.println("Step " + i);
        }

        int size = 7;
        System.out.println("Size is " + (size++));
        System.out.println("Size is " + size);

        int nrOfNumbers = scanner.nextInt();
        int divisor = scanner.nextInt();
        int found = 0;
        int currentNumber = 0;

        while (found < nrOfNumbers) {
            if (currentNumber % divisor == 0) {
                System.out.println(currentNumber);
                found++;
            }
            currentNumber++;
        }
        System.out.println("Current number : " + currentNumber);

        found = 0;
        currentNumber = 0;
        do {
            if (currentNumber % divisor == 0) {
                System.out.println(currentNumber);
                found++;
            }
            currentNumber++;
        } while (found < nrOfNumbers);
        System.out.println("Current number : " + currentNumber);

        int[] nums = { 10, 20, 30, 40, 50 };

        int sum = 0;

        for (int x : nums) {

            if (x == 30) {
                continue;
            }

            sum += x;

            if (sum > 65) {
                break;
            }
            System.out.println(x);
        }

        System.out.println("sum: " + sum);


        //Afisam primul numar mai mic decat 100 care se divide cu un numar dat
        currentNumber = 1;
        divisor = scanner.nextInt();
        while (currentNumber <= 100) {
            if (currentNumber % divisor == 0) {
                System.out.println(currentNumber);
                break;
            }
            currentNumber++;
        }

        currentNumber = 1;
        divisor = scanner.nextInt();
        boolean isFound = false;
        while (!isFound) {
            if (currentNumber % divisor == 0) {
                System.out.println(currentNumber);
                isFound = true;
            }
            currentNumber++;
        }

        int[] list = { 10, 20, 30, 40, 50 };

        for (int i = 0; i < list.length; i++) {
            int crtNumber = list[i];
            for (int j = 1; j < crtNumber; j++) {
                if (j % 2 == 0) {
                    System.out.println(j);
                    break;
                }
            }
        }

    }

}
