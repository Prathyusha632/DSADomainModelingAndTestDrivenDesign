package org.ThoughtWorks.com;

import java.util.Objects;

public abstract class Measurement<T extends Measurement> {
    public final double value;
    public final Units unit;

    public Measurement(double value, Units unit) {
        this.value = value;
        this.unit = unit;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Measurement<T> that = (Measurement<T>) o;
        System.out.println(this.convertToMetric(that)+" "+value);
        return (this.convertToMetric(that) == value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value, unit);
    }

    double convertToMetric(Measurement<T> that){
        System.out.println(Math.round((that.value-that.unit.getConstant())*this.unit.getMultiplier()/that.unit.getMultiplier()
                +this.unit.getConstant()));
        return ((that.value-that.unit.getConstant())*this.unit.getMultiplier()/that.unit.getMultiplier()
                +this.unit.getConstant());
    }
}