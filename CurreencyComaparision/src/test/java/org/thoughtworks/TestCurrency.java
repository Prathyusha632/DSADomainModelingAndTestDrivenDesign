package org.thoughtworks;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.thoughtworks.Currency.*;
public class TestCurrency {
    @Test
    public void testSeventyFourPointTwoOneRupeesEqualsOneDollar() {
        Currency seventyFourPointTwoOneRupees = rupee(74.21);
        Currency oneDollar = dollar(1);

        Assertions.assertEquals(seventyFourPointTwoOneRupees,oneDollar);
    }

}
