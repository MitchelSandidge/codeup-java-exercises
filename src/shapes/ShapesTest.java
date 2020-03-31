package shapes;

public class ShapesTest {
    public static void main(String[] args) {

        // Box 1
        Rectangle box1 = new Rectangle(5, 4);
        System.out.println("\n\tBox 1");
        System.out.println("\tArea: " + box1.getArea());
        System.out.println("\tPerimeter: " + box1.getPerimeter());

        // Box 2
        Square box2 = new Square(5);
        System.out.println("\n\tBox 2");
        System.out.println("\tArea: " + box2.getArea());
        System.out.println("\tPerimeter: " + box2.getPerimeter());

        // Box 3 --> Square
        Square box3 = new Square(8);
        System.out.println("\n\tBox 3");
        System.out.println("\tArea: " + box3.getArea());
        System.out.println("\tPerimeter: " + box3.getPerimeter());

        // Box 4 from Measurable
        Measurable myShape = new Rectangle(4, 6);
        System.out.println("\n\tBox 4 from Measurable");
        System.out.println("\tArea: " + myShape.getArea());
        System.out.println("\tPerimeter: " + myShape.getPerimeter());

        // Box 5 from Measurable
        Measurable mySquare = new Square(9);
        System.out.println("\n\tBox 5 from Measurable");
        System.out.println("\tArea: " + mySquare.getArea());
        System.out.println("\tPerimeter: " + mySquare.getPerimeter());

    }
}




// Answer the following Questions...

//  Q1. Why does the code fail to compile if you leave off the getPerimeter method in Rectangle?
    // A:  It has to implement all methods defined in the interface "Measurable".


//  Q2. What happens if you try to call the getLength or getWidth methods of the myShape variable? Why?
    // A: It doesn't recognise the method. Because "Quadrilateral" is abstract and you can't call methods from abstract.