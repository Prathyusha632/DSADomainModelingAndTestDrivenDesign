import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ArithmeticTest {
    @Test
    public void twoPositiveNumbersAddition()
    {
        int number1 = 3, number2 = 4;
        int expectedValue = 7;
        Arithmetic testObject = new Arithmetic();
        int actualValue = testObject.addTwoNumbers(number1, number2);
        Assertions.assertEquals(expectedValue, actualValue);
    }
    @Test
    public void negativeNumber1Addition()
    {
        int number1 = -3, number2 = 4;
        int expectedValue = 1;
        Arithmetic testObject = new Arithmetic();
        int actualValue = testObject.addTwoNumbers(number1, number2);
        Assertions.assertEquals(expectedValue, actualValue);
    }
    @Test
    public void negativeNumber2Addition()
    {
        int number1 = 3, number2 = -4;
        int expectedValue = -1;
        Arithmetic testObject = new Arithmetic();
        int actualValue = testObject.addTwoNumbers(number1, number2);
        Assertions.assertEquals(expectedValue, actualValue);
    }
    @Test
    public void twoNegativeNumbersAddition()
    {
        int number1 = -3, number2 = -4;
        int expectedValue = -7;
        Arithmetic testObject = new Arithmetic();
        int actualValue = testObject.addTwoNumbers(number1, number2);
        Assertions.assertEquals(expectedValue, actualValue);
    }
    @Test
    public void twoPositiveNumbersMultiplication()
    {
        int number1 = 3, number2 = 4;
        int expectedValue = 12;
        Arithmetic testObject = new Arithmetic();
        int actualValue = testObject.multiplyTwoNumbers(number1, number2);
        Assertions.assertEquals(expectedValue, actualValue);
    }
    @Test
    public void negativeNumber1Multiplication()
    {
        int number1 = -3, number2 = 4;
        int expectedValue = -12;
        Arithmetic testObject = new Arithmetic();
        int actualValue = testObject.multiplyTwoNumbers(number1, number2);
        Assertions.assertEquals(expectedValue, actualValue);
    }
    @Test
    public void negativeNumber2Multiplication()
    {
        int number1 = 3, number2 = -4;
        int expectedValue = -12;
        Arithmetic testObject = new Arithmetic();
        int actualValue = testObject.multiplyTwoNumbers(number1, number2);
        Assertions.assertEquals(expectedValue, actualValue);
    }
    @Test
    public void twoNegativeNumbersMultiplication()
    {
        int number1 = -3, number2 = -4;
        int expectedValue = 12;
        Arithmetic testObject = new Arithmetic();
        int actualValue = testObject.multiplyTwoNumbers(number1, number2);
        Assertions.assertEquals(expectedValue, actualValue);
    }
}
