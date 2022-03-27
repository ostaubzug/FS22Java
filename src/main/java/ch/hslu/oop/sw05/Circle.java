/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch.hslu.oop.sw05;

/**
 *
 * @author ostau
 */
public class Circle extends Shape {

    private int diameter;

    public Circle(int x, int y, int diameter){
        super(x,y);
        this.x = x;
        this.y = y;
        this.diameter = diameter;
    }
    
    public void setDiameter(int diameter){
        this.diameter = diameter;
    }
    
    public int getDiameter(){
        int returnDiameter = diameter;
        return returnDiameter;
    }
        
    @Override
    public int getPerimeter() {
       return 3 * diameter;
    }

    @Override
    public int getArea() {
        return 9 * diameter;
    }
    
}
