package ch.hslu.oop.sw08;

public enum Aggregate {

    LIQUID("flüssig"), SOLID("fest"), GAS("gasförmig");

    private final String zustand;

    private Aggregate(final String zustand){
        this.zustand = zustand;
    }

    public String getZustand(){
        return this.zustand;
    }

}

