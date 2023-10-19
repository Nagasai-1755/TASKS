package com.first;

import java.util.Scanner;

class DataTypeChecker {
    void check(int value) {
        System.out.println("Input is an integer.");
    }

    void check(float value) {
        System.out.println("Input is a float.");
    }

    void check(boolean value) {
        System.out.println("Input is a boolean.");
    }
}

public class Main {
    public static void main(String[] args) {
        
        DataTypeChecker checker = new DataTypeChecker();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a value: ");
        if (scanner.hasNextInt()) {
            int inputValue = scanner.nextInt();
            checker.check(inputValue);
        } else if (scanner.hasNextFloat()) {
            float inputValue = scanner.nextFloat();
            checker.check(inputValue);
        } else if (scanner.hasNextBoolean()) {
            boolean inputValue = scanner.nextBoolean();
            checker.check(inputValue);
        } else {
            System.out.println("Input is String");
        }

        scanner.close();
    }
}