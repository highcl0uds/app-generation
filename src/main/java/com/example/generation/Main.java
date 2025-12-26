package com.example.generation;


public class Main {
    public static void main(String[] args) {
        int year = 1997;

        System.out.print("Your year of birth: " + year);

        String generation = GenerationCalculation.getGeneration(year);
        System.out.println("Your generation is: " + generation);
    }
}