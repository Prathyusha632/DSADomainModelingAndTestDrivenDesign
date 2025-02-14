package org.ThoughtWorks.com;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.ThoughtWorks.com.Measurement.*;
import static org.ThoughtWorks.com.Length.*;
import static org.ThoughtWorks.com.Weight.*;
import static org.ThoughtWorks.com.Temperature.*;

public class TestMeasurement {
    @Nested
    @DisplayName("Tests for Length")
    class TestLength {
        @Test
        public void test1cmEquals1cm() {
            Length oneCm = centimeter(1);
            Length anotherOneCm = centimeter(1);

            Assertions.assertEquals(oneCm, anotherOneCm);
        }

        @Test
        public void test1mEquals100cm() {
            Length oneMetre = meter(1);
            Length hundredCentimetre = centimeter(100);

            Assertions.assertEquals(oneMetre, hundredCentimetre);
        }

        @Test
        public void test100cmNotEqualsTenthPartOf1km() {
            Length hundredCentimetre = centimeter(100);
            Length tenthPartOfKilometre = kilometer(0.1);

            Assertions.assertNotEquals(hundredCentimetre, tenthPartOfKilometre);
        }

        @Test
        public void test1mPlus100cmEquals2m() {
            Length oneMeter = meter(1);
            Length hundredCentimeter = centimeter(100);
            Length twoMeter = meter(2);

            Assertions.assertEquals(oneMeter.plus(hundredCentimeter), twoMeter);
        }

        @Test
        public void test200cmPlus1kmEquals100200cm() {
            Length twoHundredCentimetre = centimeter(200);
            Length oneKilometre = kilometer(1);
            Length oneLakhTwoHundredCentimetre = centimeter(100200);

            Assertions.assertEquals(twoHundredCentimetre.plus(oneKilometre),
                    oneLakhTwoHundredCentimetre);
        }

        @Test
        public void test200cmPlus1mAnd1kmEquals100300cm() {
            Length twoHundredCentimetre = centimeter(200);
            Length oneMeter = meter(1);
            Length oneKilometre = kilometer(1);
            Length oneLakhThreeHundredCentimetre = centimeter(100300);

            Assertions.assertEquals(twoHundredCentimetre.plus(oneMeter).plus(oneKilometre),
                    oneLakhThreeHundredCentimetre);
        }

        @Test
        public void test1mMinus50cmEqualsPoint5m() {
            Length oneMeter = meter(1);
            Length fiftyCentimeter = centimeter(50);
            Length halfMeter = meter(0.5);

            Assertions.assertEquals(oneMeter.minus(fiftyCentimeter), halfMeter);
        }

        @Test
        public void test2000cmMinus1mEquals1900cm() {
            Length twoThousandCentimeter = centimeter(2000);
            Length oneMeter = meter(1);
            Length nineteenHundredCentimeter = centimeter(1900);

            Assertions.assertEquals(twoThousandCentimeter.minus(oneMeter), nineteenHundredCentimeter);
        }
    }
    @Nested
    @DisplayName("Tests for Weight")
    class TestWeight {

        @Test
        public void test1gmEquals1gm() {
            Weight oneGram = gram(1);
            Weight anotherOneGram = gram(1);

            Assertions.assertEquals(oneGram, anotherOneGram);
        }

        @Test
        public void testPoint1kgEquals100gm() {
            Weight pointOneKilogram = kilogram(0.1);
            Weight hundredGram = gram(100);

            Assertions.assertEquals(pointOneKilogram, hundredGram);
        }

        @Test
        public void test10gPlus1kgEquals1010g() {
            Weight tenGram = gram(10);
            Weight oneKilogram = kilogram(1);
            Weight oneThousandTenGram = gram(1010);

            Assertions.assertEquals(tenGram.plus(oneKilogram), oneThousandTenGram);
        }

        @Test
        public void testOnePoint5kgMinus500gEquals1kg() {
            Weight onePoint5Kilogram = kilogram(1.5);
            Weight fiveHundredGram = gram(500);
            Weight oneKilogram = kilogram(1);

            Assertions.assertEquals(onePoint5Kilogram.minus(fiveHundredGram), oneKilogram);
        }

    }
    @Nested
    @DisplayName("Tests for Temperature")
    class TestTemperature {
        @Test
        public void test0CEquals32F() {
            Temperature zeroCelsius = celsius(0);
            Temperature thirtyTwoFahrenheit = fahrenheit(32);

            Assertions.assertEquals(zeroCelsius, thirtyTwoFahrenheit);
        }

        @Test
        public void test0KEqualsNegative273C() {
            Temperature zeroKelvin = kelvin(0);
            Temperature negative273Celsius = celsius(-273.15);

            Assertions.assertEquals(zeroKelvin, negative273Celsius);
        }

        @Test
        public void test2mEquals200cm() {
            Length twoMeter = meter(1);
            Length twoHundredcm = centimeter(100);

            Assertions.assertEquals(twoMeter.plus(twoHundredcm), twoHundredcm.plus(twoMeter));
        }
    }
}
