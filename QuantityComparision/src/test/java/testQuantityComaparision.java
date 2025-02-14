import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class testQuantityComaparision {
    @Test
    public void testQuantityUnitNotEqualToCm()
    {
        String quantity="1m";
        QuantityComparision quantityCompares = new QuantityComparision();
        String expectedValue="Not Equal";

        String actualValue =quantityCompares.quantityIsOneCM(quantity);

        Assertions.assertEquals(expectedValue,actualValue);
    }

    @Test
    public void testQuantityValueNotEqualToOneCm()
    {
        String quantity="2cm";
        QuantityComparision quantityCompares = new QuantityComparision();
        String expectedValue="Not Equal";

        String actualValue =quantityCompares.quantityIsOneCM(quantity);

        Assertions.assertEquals(expectedValue,actualValue);
    }

    @Test
    public void testQuantityEqualsOneCm()
    {
        String quantity="1cm";
        QuantityComparision quantityCompares = new QuantityComparision();
        String expectedValue="Equal";

        String actualValue =quantityCompares.quantityIsOneCM(quantity);

        Assertions.assertEquals(expectedValue,actualValue);
    }
}
