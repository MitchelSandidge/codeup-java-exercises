package shapes;

public class Rectangle {

    // Initiating Variables
    protected int length;
    protected int width;

    // Constructor
    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    // Methods
    public int getArea() {
        return length * width;
    }
    public int getPerimeter() {
        return (length * 2) + (width * 2);
    }
}