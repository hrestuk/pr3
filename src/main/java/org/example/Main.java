package org.example;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        double result = 0;

        result = calculator.add(5, 6);
        System.out.println("Addition Result: " + result);

        result = calculator.subtract(7, 5);
        System.out.println("Subtraction Result: " + result);

        result = calculator.multiply(6, 4);
        System.out.println("Multiplication Result: " + result);

        try {
            result = calculator.divide(2, 0);
            System.out.println("Division Result: " + result);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        try {
            result = calculator.sqrt(-5);
            System.out.println("Square Root Result: " + result);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }




    }
}