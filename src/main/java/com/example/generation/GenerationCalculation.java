package com.example.generation;

public class GenerationCalculation {

    public static String getGeneration(int year) {
        if (year >= 1946 && year <= 1964) return "Baby Boomer";
        else if (year >= 1965 && year <= 1980) return "Generation X";
        else if (year >= 1981 && year <= 1996) return "Millennials";
        else if (year >= 1997 && year <= 2012) return "Generation Z";
        else if (year >= 2013 && year <= 2025) return "Generation Alpha";
        else return "Unknown Generation";
    }
}