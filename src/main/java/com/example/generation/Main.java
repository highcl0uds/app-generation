package com.example.generation;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите год вашего рождения: ");
        int year = scanner.nextInt();

        String generation = GenerationCalculation.getGeneration(year);
        System.out.println("Ваше поколение: " + generation);
    }
}