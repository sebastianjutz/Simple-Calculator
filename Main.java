/*
Class:		CSE 1322L
Section: 	W01
Term:		Fall 2020
Instructor:	Devi Samyuktha S
Name:		Sebastian Utz
Lab#:		Lab 7
*/
package com.company;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int userInput;
        float userInput1;
        float userInput2;
        do {
            userInput = menu();
            switch (userInput) {
                case 0:
                    break;
                case 1:
                    Calculator c = new Calculator();
                    System.out.println("Please enter the first number: ");
                    userInput1 = scnr.nextFloat();
                    System.out.println("Please enter the second number: ");
                    userInput2 = scnr.nextFloat();
                    System.out.println("Your Answer is: " + c.add(userInput1, userInput2));
                    System.out.println(" ");
                    break;
                case 2:
                    Calculator c1 = new Calculator();
                    System.out.println("Please enter the first number: ");
                    userInput1 = scnr.nextFloat();
                    System.out.println("Please enter the second number: ");
                    userInput2 = scnr.nextFloat();
                    System.out.println("Your Answer is: " + c1.subtract(userInput1, userInput2));
                    System.out.println(" ");
                    break;
                case 3:
                    Calculator c2 = new Calculator();
                    System.out.println("Please enter the first number: ");
                    userInput1 = scnr.nextFloat();
                    System.out.println("Please enter the second number: ");
                    userInput2 = scnr.nextFloat();
                    System.out.println("Your Answer is: " + c2.multiply(userInput1, userInput2));
                    System.out.println(" ");
                    break;
                case 4:
                    Calculator c3 = new Calculator();
                    System.out.println("Please enter the first number: ");
                    userInput1 = scnr.nextFloat();
                    System.out.println("Please enter the second number: ");
                    userInput2 = scnr.nextFloat();
                    System.out.println("Your Answer is: " + c3.divide(userInput1, userInput2));
                    System.out.println(" ");
                    break;
                default:
                    System.out.println("Please enter one of the options(0, 1, 2, 3, 4)");
                    System.out.println(" ");
            }
        }while(userInput != 0);
        System.out.println("You chose to Exit. Thank you! Good Bye!!!");
    }
    public static int menu() {
        Scanner scnr = new Scanner(System.in);
        int userInput;
        System.out.println("---Menu---");
        System.out.println("0 - Exit");
        System.out.println("1 - Addition");
        System.out.println("2 - Subtraction");
        System.out.println("3 - Multiplication");
        System.out.println("4 - Division");
        System.out.println("Please Choose an Option: ");
        userInput = scnr.nextInt();
        return userInput;
    }
}