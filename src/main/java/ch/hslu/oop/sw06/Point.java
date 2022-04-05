/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch.hslu.oop.sw06;

/**
 * Beschreibt einen Punkt mit zwei Koordinaten. get Quadrant gibt den Quadranten
 * an
 * 
 * @author Oliver Staub
 */
public class Point {
    private int x;
    private int y;

    //man könnte beim verschieben noch auf overflows aufpassen

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Point(Point point) {
        this(point.getX(),point.getY());
    }
    
    public final void moveRelative(int x, int y) {
        this.x += x;
        this.y += y;
    }

    public void moveRelative(Point point) {
        this.x += point.getX();
        this.y += point.getY();
    }

    // schlechte Idee weil Signaturen sehr ähnlich sind
    public void moveRelative(double angle, double amount) {
        int xVector = (int) (angle * Math.cos(amount));
        this.x += xVector;
        int yVector = (int) (angle * Math.cos(amount));
        this.y+= yVector;
    }

    public int getQuadrant() {
        if (x > 0 && y > 0) {
            return 1;
        }

        else if (x < 0 && y > 0) {
            return 2;
        }

        else if (x < 0 && y < 0) {
            return 3;
        }

        else if (x > 0 && y < 0) {
            return 4;
        }

        else {
            // Kann keinem Quadranten zugeordnet werden
            return 0;
        }
    }

    public int getX() {
        int xCopy = x;
        return xCopy;
    }

    public int getY() {
        int yCopy = y;
        return yCopy;
    }

    @Override
    public String toString(){
        return "Point ["+ x + " " + y + "]";
    }

}
