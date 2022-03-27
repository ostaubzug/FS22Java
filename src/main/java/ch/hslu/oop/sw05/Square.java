/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch.hslu.oop.sw05;

/**
 *
 * @author ostau
 */
public class Square extends Shape {

    public Square(int x){
        super(x,x);
    }

    @Override
    public int getPerimeter() {
        return 2*x + 2*y;
    }

    @Override
    public int getArea() {
        return x*x;
    }
    
}
