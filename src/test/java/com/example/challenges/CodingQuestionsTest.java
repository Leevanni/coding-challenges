package com.example.challenges;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CodingQuestionsTest {

    @Test
    void shouldReturnCorrectFactorCountFor15() {
        int result = CodingQuestions.factors(15);

        assertEquals(4, result);
    }
    
    @Test
    void shouldReturnCorrectFactorCountFor10() {
        int result = CodingQuestions.factors(10);

        assertEquals(4, result);
    }
    
    @Test
    void shouldReturnCorrectFactorCountFor12() {
        int result = CodingQuestions.factors(12);

        assertEquals(6, result);
    }
    
    @Test
    void shouldHandleOne() {
    	int result = CodingQuestions.factors(1);
    	assertEquals(1, result);
    }
    
    @Test
    void shouldHandlePrime() {
    	int result = CodingQuestions.factors(17);
    	assertEquals(2, result);
    }
    
    @Test
    void shouldHandlePerfectSqure() {
    	int result = CodingQuestions.factors(16);
    	assertEquals(5, result);
    }
    
    @Test
    void shouldHandleZero() {
    	// invalid
        assertThrows(IllegalArgumentException.class, () -> {
            CodingQuestions.factors(0);
        });
    }
    
    @Test
    void shouldHandleNegativeNumber() {
    	// invalid
        assertThrows(IllegalArgumentException.class, () -> {
            CodingQuestions.factors(-10);
        });
    }


}
