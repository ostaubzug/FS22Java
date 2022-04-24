package ch.hslu.oop.sw08;

import java.util.EnumMap;
import java.util.Objects;

public abstract class ChemicalElement implements Comparable<ChemicalElement> {

    private final String symbol;
    private final Temparature boilTemperature;
    private final Temparature meltTemperature;

    public ChemicalElement(String symbol, Temparature boilTemperature, Temparature meltTemperature) {
        this.symbol = symbol;
        this.boilTemperature = boilTemperature;
        this.meltTemperature = meltTemperature;
    }

    public String getSymbol() {
        return symbol;
    }

    public Aggregate getAggregateState(Temparature temparature) {
        if (temparature.getKelvin() <= meltTemperature.getKelvin()) {
            return Aggregate.SOLID;
        } else if (temparature.getKelvin() > meltTemperature.getKelvin()
                && temparature.getKelvin() <= boilTemperature.getKelvin()) {
            return Aggregate.LIQUID;
        } else {
            return Aggregate.GAS;
        }
    }

    public String getAggregateStateString(Temparature temparature) {
        switch(getAggregateState(temparature)){
            case GAS:
                return getSymbol() + " ist bei " + Float.toString(temparature.getCelsius()) + " °C " + Aggregate.gaseous;
            case LIQUID:
                return getSymbol() + " ist bei " + Float.toString(temparature.getCelsius()) + " °C " + Aggregate.liquid;
            case SOLID:
                return getSymbol() + " ist bei " + Float.toString(temparature.getCelsius()) + " °C " + Aggregate.solid;
            default:
                return "Error: Aggregate State could not be defined";
        }
    }


    @Override
    public String toString() {
        return "ChemicalElement[Symbol=" + this.symbol + "]";
    }

    @Override
    public final boolean equals(final Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof ChemicalElement p)) {
            return false;
        }
        return (Objects.equals(p.boilTemperature, this.boilTemperature)) &&
                (Objects.equals(p.meltTemperature, this.meltTemperature)) &&
                (Objects.equals(p.symbol, this.symbol));
    }

    @Override
    public final int hashCode() {
        return Objects.hash(this.symbol, this.boilTemperature, this.meltTemperature);
    }

    @Override
    public int compareTo(ChemicalElement other) {

        if(this.symbol.compareTo(other.symbol) > 0){
            return 1;
        }

        if(this.symbol.compareTo(other.symbol) < 0){
            return -1;
        }
        
        return 0;
    }

}
