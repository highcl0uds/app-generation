package com.example.generation;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class GenerationCalculationTest {

    @Test
    void testBabyBoomer() {
        assertEquals("Baby Boomer", GenerationCalculation.getGeneration(1950));
    }

    @Test
    void testGenerationX() {
        assertEquals("Generation X", GenerationCalculation.getGeneration(1970));
    }

    @Test
    void testMillennials() {
        assertEquals("Millennials", GenerationCalculation.getGeneration(1990));
    }

    @Test
    void testGenerationZ() {
        assertEquals("Generation Z", GenerationCalculation.getGeneration(2005));
    }

    @Test
    void testGenerationAlpha() {
        assertEquals("Generation Alpha", GenerationCalculation.getGeneration(2015));
    }

    @Test
    void testUnknownGeneration() {
        assertEquals("Unknown Generation", GenerationCalculation.getGeneration(1930));
        assertEquals("Unknown Generation", GenerationCalculation.getGeneration(2030));
    }
}