
package ch.hslu.oop.sw05;

public interface ISwitchable
{
    /**
     * Das Konstrukt wird eingestellt.
     */
    public void switchOn();
    /**
     * Das Konstrukt wird abgestellt.
     */
    public void switchOff();
    /**
     * 
     * @return boolean
     *         Gibt true zurück wenn das Konstrukt eingestellt ist.
     */
        public boolean isSwitchedOn();
    /**
     * @return boolean
     *         Gibt true zurück wenn das Konstrukt abgestellt ist.
     */
    public boolean isSwitchedOff();
}
