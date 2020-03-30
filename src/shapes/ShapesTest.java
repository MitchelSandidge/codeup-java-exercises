package shapes;

public class ShapesTest {
    public static void main(String[] args) {

        // Box 1
        Rectangle box1 = new Rectangle(5, 4);
        System.out.println("\n\tBox 1");
        System.out.println("\tArea: " + box1.getArea());
        System.out.println("\tPerimeter: " + box1.getPerimeter());


        // Box 2
        Rectangle box2 = new Square(5);
        System.out.println("\n\tBox 2");
        System.out.println("\tArea: " + box2.getArea());
        System.out.println("\tPerimeter: " + box2.getPerimeter());

        // Box 3 --> Square
        Square box3 = new Square(8);
        System.out.println("\n\tBox 3");
        System.out.println("\tArea: " + box3.getArea());
        System.out.println("\tPerimeter: " + box3.getPerimeter());
    }
}
