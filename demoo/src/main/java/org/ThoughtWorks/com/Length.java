package org.ThoughtWorks.com;

public class Length extends ScalarMeasurement<Length> {
    public Length(double value, Units unit) {
            super(value, unit);
    }

    @Override
    Length createMeasurement(double sum, Units unit) {
        return new Length(sum, unit);
    }

    public enum LengthUnit implements Units {
        KILOMETER(1,0), METER(1000,0),
        CENTIMETER(100000,0);
            public double multiplier;
            public double constant;
            LengthUnit(double multiplier, double constant) {
                this.multiplier = multiplier;
                this.constant=constant;
            }

        @Override
        public double getMultiplier() {
            return multiplier;
        }

        @Override
        public double getConstant() {
            return constant;
        }
    }

        public static Length centimeter(double centimeterValue) {
            return new Length(centimeterValue, LengthUnit.CENTIMETER);
        }

        public static Length meter(double meterValue) {
            return new Length(meterValue, LengthUnit.METER);
        }

        public static Length kilometer(double kilometerValue) {
            return new Length(kilometerValue, LengthUnit.KILOMETER);
        }

}
