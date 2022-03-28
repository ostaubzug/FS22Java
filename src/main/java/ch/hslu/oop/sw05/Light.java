package ch.hslu.oop.sw05;

public class Light implements ICountingSwitchable {

    private boolean isSwitchedOn = false;
    private int switchCounter = 0;

    @Override
    public void switchOn() {
        isSwitchedOn = true;
        switchCounter++;        
    }

    @Override
    public void switchOff() {
        isSwitchedOn = false;
        switchCounter++;    
    }

    @Override
    public boolean isSwitchedOn() {
        return isSwitchedOn;
    }

    @Override
    public boolean isSwitchedOff() {
        return !isSwitchedOn;
    }
 

    @Override
    public long getSwitchCount() {
        return switchCounter;
    }

    
}
