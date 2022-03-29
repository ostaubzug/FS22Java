package ch.hslu.oop.sw05;

public abstract class ChemicalElement {

    //TODO Temparatur als Temparatur Objekt verwenden, damit es einfacher ist.
    //TODO TemparaturKlasse refactoring

    private String symbol;
    private int boilTemperatureKelvin;
    private int meltTemperatureKelvin;


    public ChemicalElement(String symbol, int boilTemperatureKelvin, int meltTemperatureKelvin) {
        this.symbol = symbol;
        this.boilTemperatureKelvin = boilTemperatureKelvin;
        this.meltTemperatureKelvin = meltTemperatureKelvin;
    }

    public String getSymbol() {
        return symbol;
    }

    @Override
    public String toString(){
        return "ChemicalElement[Symbol=" + this.symbol + "]";
    }

    public String getAggregateState(int temparatureKelvin){
        if(temparatureKelvin <= meltTemperatureKelvin)
        {
          return "fest";                         
        }
        else if(temparatureKelvin > meltTemperatureKelvin && temparatureKelvin <= boilTemperatureKelvin)
        {
          return "flüssig";                         
        }
        else
        {
            return "gasförmig";
        }
    }









    
}
