/*
Class:		CSE 1322L
Section: 	W01
Term:		Fall 2020
Instructor:	Devi Samyuktha S
Name:		Sebastian Utz
Lab#:		Lab 7
*/
package com.company;
public class Calculator implements CalcOp{
    Calculator() {
    }
    @Override
    public float add(float num1, float num2) {
        return num1 + num2;
    }
    @Override
    public float subtract(float num1, float num2) {
        return num1 - num2;
    }
    @Override
    public float multiply(float num1, float num2) {
        return num1 * num2;
    }
    @Override
    public float divide(float num1, float num2) {
        if (num2 == 0) {
            System.out.println("You cannot divide by zero!");
            return 0;
        }
        else {
            return num1 / num2;
        }
    }
}