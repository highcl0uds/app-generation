package com.example.generation;


public class Main {
    public static void main(String[] args) {
        int year = 1997;

        System.out.print("Год вашего рождения: " + year);

        String generation = GenerationCalculation.getGeneration(year);
        System.out.println("Ваше поколение: " + generation);
    }
}