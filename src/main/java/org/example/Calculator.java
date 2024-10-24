package org.example;

public class Calculator
{
    public double add(double a, double b)  {

        return a + b;
    }

    public double subtract(double a, double b) {

        return a - b;
    }

    public double multiply(double a, double b) {

        return a * b;
    }

    public double divide(double a, double b) throws InvalidInputException {
        validateNumbers(a,b);
        if (b == 0) {
            throw new ArithmeticException("Не можна ділити на нуль");
        }
        return a / b;
    }
    public double sqrt(double a) throws InvalidInputException {
        validateNumbers(a);
        if (a < 0) {
            throw new InvalidInputException("Вхідне значення не може бути менше нуля для квадратного кореня");
        }
        return Math.sqrt(a);
    }
    public void validateNumbers(double... nums) throws InvalidInputException
    {
        for (double num : nums)
        {
            if (Double.isNaN(num))
            {
                throw new InvalidInputException("Значення не є числом");
            }

        }
    }
}

