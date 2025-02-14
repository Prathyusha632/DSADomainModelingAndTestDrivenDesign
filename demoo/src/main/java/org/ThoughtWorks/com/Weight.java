package org.ThoughtWorks.com;

public class Weight extends ScalarMeasurement<Weight> {
    public Weight(double value, Units unit) {
        super(value, unit);
    }

    @Override
    Weight createMeasurement(double sum, Units unit) {
        return new Weight(sum,unit);
    }


    public enum WeightUnit implements Units {
       KILOGRAM(1,0),GRAM(1000,0);
        public double multiplier;
        public double constant;
        WeightUnit(double multiplier, double constant) {
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

    static Weight kilogram(double centimeterValue) {
        return new Weight(centimeterValue, WeightUnit.KILOGRAM);
    }

    static Weight gram(double meterValue) {
        return new Weight(meterValue, WeightUnit.GRAM);
    }
}
