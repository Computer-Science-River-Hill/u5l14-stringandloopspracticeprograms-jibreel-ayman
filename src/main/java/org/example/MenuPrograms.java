package org.example; //DO NOT DELETE

//IMPORT STATEMENTS

//CLASS 

//main METHOD


import java.util.Scanner;

public class MenuPrograms {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Further Substring Fun");
            System.out.println("2. Run of Integers");
            System.out.println("3. Sum of a Range of Sequential Integers");
            System.out.println("4. Repeatedly Echo a Word");
            System.out.println("5. Words Separated by Dots");
            System.out.println("6. Adding up Integers");
            System.out.println("7. Shipping Cost Calculator");
            System.out.println("0. Exit");
            System.out.print("Choose an option: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    substringFun(scanner);
                    break;
                case 2:
                    runOfIntegers(scanner);
                    break;
                case 3:
                    sumOfRange(scanner);
                    break;
                case 4:
                    echoWord(scanner);
                    break;
                case 5:
                    wordsWithDots(scanner);
                    break;
                case 6:
                    addIntegers(scanner);
                    break;
                case 7:
                    shippingCost(scanner);
                    break;
                case 0:
                    System.out.println("Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        } while (choice != 0);
    }

    public static void substringFun(Scanner scanner) {
        System.out.print("Enter a string:\n");
        String original = scanner.nextLine();
        System.out.print("Enter beginning index: ");
        int start = scanner.nextInt();
        System.out.print("Enter ending index: ");
        int end = scanner.nextInt();
        System.out.println("\nOriginal string:\n" + original);
        if (start >= 0 && end <= original.length() && start < end) {
            System.out.println("\nSubstring:\n" + original.substring(start, end));
        } else {
            System.out.println("Invalid indices.");
        }
    }

    public static void runOfIntegers(Scanner scanner) {
        System.out.print("Enter Start: ");
        int start = scanner.nextInt();
        System.out.print("Enter End: ");
        int end = scanner.nextInt();
        for (int i = start; i <= end; i++) {
            System.out.println(i);
        }
    }

    public static void sumOfRange(Scanner scanner) {
        System.out.print("Enter low: ");
        int low = scanner.nextInt();
        System.out.print("Enter high: ");
        int high = scanner.nextInt();
        int sumHigh = (high * (high + 1)) / 2;
        int sumLow = ((low - 1) * low) / 2;
        int sum = sumHigh - sumLow;
        System.out.println("Sum = " + sum);
    }

    public static void echoWord(Scanner scanner) {
        System.out.print("Enter a word:\n");
        String word = scanner.nextLine();
        int times = word.length();
        for (int i = 0; i < times; i++) {
            System.out.println(word);
        }
    }

    public static void wordsWithDots(Scanner scanner) {
        System.out.print("Enter first word:\n");
        String word1 = scanner.nextLine();
        System.out.print("Enter second word:\n");
        String word2 = scanner.nextLine();
        int dots = 30 - word1.length() - word2.length();
        System.out.print(word1);
        for (int i = 0; i < dots; i++) {
            System.out.print(".");
        }
        System.out.println(word2);
    }

    public static void addIntegers(Scanner scanner) {
        System.out.print("How many integers will be added:\n");
        int count = scanner.nextInt();
        int sum = 0;
        for (int i = 0; i < count; i++) {
            System.out.print("Enter an integer:\n");
            sum += scanner.nextInt();
        }
        System.out.println("The sum is " + sum);
    }

    public static void shippingCost(Scanner scanner) {
        while (true) {
            System.out.print("Weight of Order:\n");
            double weight = scanner.nextDouble();
            if (weight <= 0) {
                System.out.println("bye");
                break;
            }
            double cost = 3.00;
            if (weight > 10) {
                cost += (weight - 10) * 0.25;
            }
            System.out.printf("Shipping Cost: $%.2f%n", cost);
        }
    }
}
