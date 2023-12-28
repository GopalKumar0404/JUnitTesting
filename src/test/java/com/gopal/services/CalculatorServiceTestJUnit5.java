package com.gopal.services;

import org.junit.jupiter.api.*;


public class CalculatorServiceTestJUnit5 {

    @BeforeAll
    public static void init(){
        System.out.println("Before all test cases");
    }

    @AfterAll
    public static void afterAllTestCase(){
        System.out.println("After all test cases");
    }

    @AfterEach
    public void afterEachTestCase(){
        System.out.println("After each test cases");
    }

    @BeforeEach
    public void beforeEachTestCase(){
        System.out.println("Before each test cases");
    }

    @Test
    public void addTwoNumbers(){
        System.out.println("Add Tow Numbers Test Case");
        int actualResult = CalculatorService.addTwoNumbers(5, 2);
        int expectedResult  = 7;

        Assertions.assertEquals(expectedResult,actualResult);
    }

    @Test
    public void sumOfAnyNumbers(){
        System.out.println("Sum of any numbers Test Case");
        int actualResult = CalculatorService.sumOfAnyNumbers(5, 6);
        int expectedResult  = 11;

        Assertions.assertEquals(expectedResult,actualResult);
    }

}
