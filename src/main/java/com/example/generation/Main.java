package com.example.generation;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your year of birth: ");
        int year = scanner.nextInt();

        String generation = GenerationCalculation.getGeneration(year);
        System.out.println("Your generation is: " + generation);
    }
}