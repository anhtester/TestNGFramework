package com.anhtester.firstpackage;

import java.time.LocalDateTime;

import org.testng.annotations.Test;

public class FirstClass {
    @Test(groups = {"smoke", "regression"}, priority = 1)
    public void TC_01_firstTest() {
        System.out.println("First test method");
    }

    @Test(groups = {"regression"})
    public void TC_02_secondTest() {
        System.out.println("Second test method");

        // Ví dụ trong một phương thức:
        System.out.println("Current time: " + LocalDateTime.now());
    }

    @Test(groups = {"smoke"}, priority = 2)
    public void TC_03_thirdTest() {
        System.out.println("Third test method");
    }

    @Test(groups = {"smoke", "regression"})
    public void TC_04_fourthTest() {
        System.out.println("Fourth test method");
    }
}
