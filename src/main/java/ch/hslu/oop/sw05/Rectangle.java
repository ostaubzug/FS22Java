/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch.hslu.oop.sw05;

/**
 *
 * @author ostau
 */
public class Rectangle extends Shape {

    private int width;
    private int height;

    public Rectangle(int x, int y, int width, int height){
        super(x,y);
        this.width = width;
        this.height = height;
    }

    public void changeDimension(int newWidth, int newHeight){
        this.width = newWidth;
        this.height = newHeight;
    }

    public int getWidth() {
        return width;
    }
    public int getHeight(){
        return height;
    }   

    @Override
    public int getPerimeter() {
        return 2*x+2*y;
    }

    @Override
    public int getArea() {
        return x*y;
    }
    
}
