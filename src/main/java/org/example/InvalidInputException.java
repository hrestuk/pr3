package org.example;

public class InvalidInputException extends Exception
{
    public InvalidInputException(String text)
    {
        super(text);
    }
}
