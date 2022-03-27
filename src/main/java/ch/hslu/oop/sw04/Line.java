/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
        
package ch.hslu.oop.sw04;

import ch.hslu.oop.sw03.*;
/**
 *
 * @author ostau
 */
public class Line
{
    private Point pointStart;
    private Point pointEnd;
     /**
     * Konstruktor für Objekte der Klasse Line.
     * Nutzt die Klasse Point
     * 
     */
    public Line(Point pointStart,Point pointEnd)
    {
        this.pointStart = pointStart;
        this.pointEnd = pointEnd;

    }
    /**
     * Gibt den Startpunkt zurück.
     * @return pointStart
     */
    public Point getStartpoint()
    {
        return pointStart;
    }
    /**
     * gibt den Endpunkt zurück.
     * @return pointEnd
     */
    public Point getEndPoint()
    {
        return pointEnd;
    }
    
    public void setStartPoint(Point newStartPoint)
    {
        pointStart = newStartPoint;
    }
    
    public void setEndPoint(Point newEndPoint)
    {
        pointEnd = newEndPoint;
    }
}
