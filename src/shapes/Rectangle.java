package shapes;

public class Rectangle extends Quadrilateral implements Measurable{


    public Rectangle(int length, int width) {
        super(length, width);
    }

    @Override
    public int getArea() {
        return length * width;
    }
    @Override
    public int getPerimeter() {
        return (length * 2) + (width * 2);
    }





    // ---------- Exercise 2 ----------

//    // Initiating Variables
//    protected int length;
//    protected int width;
//
//    // Constructor
//    public Rectangle(int length, int width) {
//        this.length = length;
//        this.width = width;
//    }
//
//    // Methods
//    public int getArea() {
//        return length * width;
//    }
//    public int getPerimeter() {
//        return (length * 2) + (width * 2);
//    }
}