package ch.hslu.oop.sw07;

public abstract class ChemicalElement {

    private String symbol;
    private Temparature boilTemperature;
    private Temparature meltTemperature;

    public ChemicalElement(String symbol, Temparature boilTemperature, Temparature meltTemperature) {
        this.symbol = symbol;
        this.boilTemperature = boilTemperature;
        this.meltTemperature = meltTemperature;
    }

    public String getSymbol() {
        return symbol;
    }

    public String getAggregateState(Temparature temparature) {
        if (temparature.getTemperatureKelvin() <= meltTemperature.getTemperatureKelvin()) {
            return "fest";
        } else if (temparature.getTemperatureKelvin() > meltTemperature.getTemperatureCelsius()
                && temparature.getTemperatureKelvin() <= boilTemperature.getTemperatureKelvin()) {
            return "flüssig";
        } else {
            return "gasförmig";
        }
    }

    @Override
    public String toString() {
        return "ChemicalElement[Symbol=" + this.symbol + "]";
    }


}
