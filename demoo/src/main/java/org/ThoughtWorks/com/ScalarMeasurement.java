package org.ThoughtWorks.com;

abstract class ScalarMeasurement<T> extends Measurement {
    ScalarMeasurement(double value,Units unit){
        super(value,unit);
    }

    abstract T createMeasurement(double result,Units unit);

    public T plus(T measurement) {
        double sum = this.value + this.convertToMetric((Measurement) measurement);
        return createMeasurement(sum, this.unit);
    }
    public T minus(T measurement) {
        double sum = this.value - this.convertToMetric((Measurement) measurement);
        return createMeasurement(sum, this.unit);
    }
}
