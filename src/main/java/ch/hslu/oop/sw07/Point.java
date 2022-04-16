package ch.hslu.oop.sw07;

import java.util.Objects;

public final class Point {
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Point(Point point) {
        this(point.getX(), point.getY());
    }

    public final void moveRelative(int x, int y) {
        this.x += x;
        this.y += y;
    }

    public void moveRelative(Point point) {
        this.x += point.getX();
        this.y += point.getY();
    }

    //Math not correct
    public void moveRelativeAngle(double angle, double amount) {
        int xVector = (int) (angle * Math.cos(amount));
        this.x += xVector;
        int yVector = (int) (angle * Math.cos(amount));
        this.y += yVector;
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
            // cannot be assigned to quadrant
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
    public String toString() {
        return "Point [" + x + " " + y + "]";
    }

    @Override
    public final boolean equals(final Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof Point p)) {
            return false;
        }
        return (Objects.equals(p.x, this.x)) &&
                (Objects.equals(p.y, this.y));
    }

    @Override
    public final int hashCode() {
        return Objects.hash(this.x, this.y);
    }
}
