/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch.hslu.oop.sw05;

/**
 * Base Class Shape for further specialization.
 * @author ostau
 */
public abstract class Shape {
    int x;
    int y;
    
    /**
     *
     * @param x
     * @param y
     */
    protected Shape(int x, int y)
    {
        this.x = x;
        this.y = y;
    }
    
    /**
     * Input the new coordinates
     * @param newX
     * @param newY
     */
    public void move(int newX, int newY){
        this.x = newX;
        this.y = newY;
    }
    
    public int getX(){
        int returnX = x;
        return returnX;
    }
    
    public int getY(){
        int returnY = y;
        return returnY;
    }
    
    public abstract int getPerimeter();
    public abstract int getArea();
}
