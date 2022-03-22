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
    public Demo()
    {
        
    }
    
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

