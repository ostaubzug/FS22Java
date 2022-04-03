package ch.hslu.oop.sw05;

public class Mercury extends ChemicalElement {

    public Mercury() {
        super("Hg", new Temparature(356), new Temparature(-38));
        
    }

    @Override
    public String toString(){
        return super.toString() + " GIFTIG";
    }    
}
