/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch.hslu.oop.sw03;

/**
 *
 * @author ostau
 */
public class Demo
{

    /**
     * Konstruktor für Demo
     */
    public Demo()
    {
        
    }
    
    /**
     *
     * @param a input 1
     * @param b input 2
     * @return Gibt das Maximum zurück
     */
    public int max(int a, int b)
    {
        if(a > b)
        {
            return a;
        }
        else
        {
            return b;
        }
    }
    
    /**
     * Gibt das Minimum zurück
     */
    public int min(int a, int b)
    {
        if(a < b)
        {
            return a;
        }
        else
        {
            return b;
        }
        
    }
    public int maxThreeInputs(int a, int b,int c)
    {
        if(a >= max(b,c))
        {
            return a;
        }
        else if(b >= max(a,c))
        {
            return b;
        }
        else
        {
            return c;
        }
    }
}

