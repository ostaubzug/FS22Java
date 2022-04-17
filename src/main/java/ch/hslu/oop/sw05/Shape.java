
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
    public Shape(int x, int y)
    {
        this.x = x;
        this.y = y;
    }
    
    /**
     * Input the new coordinates
     * @param newX
     * @param newY
     */
    public final void move(int newX, int newY){
        this.x = newX;
        this.y = newY;
    }
    
    public final int getX(){
        int returnX = x;
        return returnX;
    }
    
    public final int getY(){
        int returnY = y;
        return returnY;
    }
    
    public abstract int getPerimeter();
    public abstract int getArea();
}
