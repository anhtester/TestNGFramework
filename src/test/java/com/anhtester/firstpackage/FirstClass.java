package com.anhtester.firstpackage;

import java.time.LocalDateTime;

import org.testng.annotations.Test;

public class FirstClass {
    @Test(groups = {"smoke", "regression"})
    public void firstTest() {
        System.out.println("First test method");
    }

    @Test
    public void secondTest() {
        System.out.println("Second test method");

        // Ví dụ trong một phương thức:
        System.out.println("Current time: " + LocalDateTime.now());
    }

    @Test(groups = {"smoke"})
    public void thirdTest() {
        System.out.println("Third test method");
    }

    @Test(groups = {"smoke", "regression"})
    public void fourthTest() {
        System.out.println("Fourth test method");
    }
}
