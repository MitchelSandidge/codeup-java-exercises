package shapes;

public class ShapesTest {
    public static void main(String[] args) {

        // Box 1
        Rectangle box1 = new Rectangle(5, 4);
        System.out.println("Box 1");
        System.out.println(box1.getArea());
        System.out.println(box1.getPerimeter());


        // Box 2
        Rectangle box2 = new Square(5);
        System.out.println("\tBox 2");
        System.out.println("\t" + box2.getPerimeter());

        // Box 3 / Square
        Square box3 = new Square(8);
        System.out.println("\t\tBox 3");
        System.out.println("\t\t" + box3.getArea());
    }
}
