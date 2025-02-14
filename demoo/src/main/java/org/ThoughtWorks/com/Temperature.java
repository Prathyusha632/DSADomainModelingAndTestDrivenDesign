package org.ThoughtWorks.com;

public class Temperature extends Measurement {
    public Temperature(double value, Units unit){
        super(value,unit);
    }

    public enum TemperatureUnit implements Units {
        CELSIUS(1,0),FAHRENHEIT(1.8,32),
        KELVIN(1,273.15);
        public double multiplier;
        public double constant;
        TemperatureUnit(double multiplier,double constant) {
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

    public static Temperature celsius(double temperatureValue) {
        return new Temperature(temperatureValue, TemperatureUnit.CELSIUS);
    }

    public static Temperature fahrenheit(double temperatureValue) {
        return new Temperature(temperatureValue, TemperatureUnit.FAHRENHEIT);
    }

    public static Temperature kelvin(double temperatureValue) {
        return new Temperature(temperatureValue, TemperatureUnit.KELVIN);
    }
}
