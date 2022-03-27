/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package ch.hslu.oop.sw04;

/**
 *
 * @author ostau
 */

/**
 * Interface für ein ein und ausschaltbares Konstrukt.
 * Implementiert 4 Methoden mit welchen ein und ausgeschaltet werden kann
 * und der derzeitige Zustand überprüft.
 * 
 * @author Oliver Staub 
 * @version 20.03.2022
 */

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
