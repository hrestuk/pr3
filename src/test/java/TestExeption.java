import org.example.Calculator;
import org.example.InvalidInputException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestExeption
{
    @Test
    public void divideTest()
    {
        Calculator calculator = new Calculator();
        Assertions.assertThrows(ArithmeticException.class, () -> calculator.divide(2, 0));
    }

    @Test
    public void sqrtTest()
    {
        Calculator calculator = new Calculator();
        Assertions.assertThrows(InvalidInputException.class, () -> calculator.sqrt(-5));
    }

}
