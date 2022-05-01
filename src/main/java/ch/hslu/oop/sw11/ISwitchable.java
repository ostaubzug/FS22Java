/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package ch.hslu.oop.sw11;

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

    public void switchOn();

    public void switchOff();

    public boolean isSwitchedOn();

    public boolean isSwitchedOff();
}
