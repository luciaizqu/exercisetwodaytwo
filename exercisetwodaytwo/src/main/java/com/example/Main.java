package com.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Create a scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for the number of lines
        System.out.print("Enter the number of lines: ");
        int numLines = scanner.nextInt();

        // Print the increasing number pattern
        for (int i = 1; i <= numLines; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);  // Print numbers in increasing order
            }
            System.out.println();  // Move to the next line after each row
        }

        // Print the decreasing number pattern
        for (int i = numLines; i >= 1; i--) {
            for (int j = i; j >= 1; j--) {
                System.out.print(j);  // Print numbers in decreasing order
            }
            System.out.println();  // Move to the next line after each row
        }

        // Close the scanner to avoid resource leaks
        scanner.close();
    }
}