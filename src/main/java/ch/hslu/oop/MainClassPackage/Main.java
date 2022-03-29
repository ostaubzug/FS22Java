package ch.hslu.oop.MainClassPackage;

import ch.hslu.oop.sw06.*;

/**
 * 
 */
public class Main {
    public static void main(String[] args){
        Point point = new Point(2,3);
        Point point2 = new Point(point);
        point2.moveRelative(point);
        point.moveRelative(2,3);
        System.out.println(point.toString());
        System.out.println(point2.toString());


    }
}
