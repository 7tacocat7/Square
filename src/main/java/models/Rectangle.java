package models;

/**
 * Created by Guest on 8/2/17.
 */

public class Rectangle {
    int length;
    int width;

    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public int getLength() {
        return length;
    }

    public int getWidth() {
        return width;
    }
    public boolean isSquare() {
        return length == width;
    }


}
