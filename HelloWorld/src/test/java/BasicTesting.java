import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BasicTesting {
    @Test
    public void testHelloWorld()
    {
        String expectedValue = "Hello, World";
        String actualValue = new HelloWorld().getHelloWorld();
        Assertions.assertEquals(expectedValue, actualValue);
    }
    @Test
    public void testPrathyusha()
    {
        Assertions.assertEquals("Prathyusha",new HelloWorld().getPrathyusha());
    }
}
