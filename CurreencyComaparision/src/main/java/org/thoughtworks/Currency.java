package org.thoughtworks;
import java.util.Objects;

import static org.thoughtworks.Currency.*;

public class Currency {
    double currencyValue;
    Units unit;
    Currency(double currencyValue,Units unit)
    {
        this.currencyValue=currencyValue;
        this.unit=unit;
    }

    enum Units{
        DOLLAR(74.21),RUPEE(1);
        double currencyRate;
        Units(double currencyRate)
        {
            this.currencyRate=currencyRate;
        }

    }
    public static Currency dollar(double dollarValue)
    {
        return new Currency(dollarValue,Units.DOLLAR);
    }

    public static Currency rupee(double rupeeValue)
    {
        return new Currency(rupeeValue,Units.RUPEE);
    }

    public double convertCurrency(Currency that)
    {
        return (this.currencyValue*this.unit.currencyRate/that.unit.currencyRate);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Currency that = (Currency) o;
        return  (this.convertCurrency(that))==that.currencyValue ;
    }

    @Override
    public int hashCode() {
        return Objects.hash(currencyValue, unit);
    }
}
