/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch.hslu.oop.sw03;

/**
 * Beschreibt einen Punkt mit zwei Koordinaten. get Quadrant gibt den Quadranten an 
 * @author Oliver Staub
 */
public class Point
{
    private int x;
    private int y;

    public Point(int x, int y)
    {
        this.x = x;
        this.y = y;
    }
    
    public int getQuadrant()
    {
        if(x > 0 && y > 0)
        {
            return 1;
        }
        
        else if(x < 0 && y > 0)
        {
            return 2;
        }
        
        else if(x < 0 && y < 0)
        {
            return 3;
        }
        
        else if(x > 0 && y < 0)
        {
            return 4;
        }
        
        else
        {
            //Kann keinem Quadranten zugeordnet werden
            return 0;
        }
    }
}
