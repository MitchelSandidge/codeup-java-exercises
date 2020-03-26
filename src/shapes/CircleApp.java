package shapes;
import util.Input;
import shapes.Circle;

public class CircleApp {
    public static void main(String[] args) {

        Input input = new Input();
        Circle circle = new Circle(input.getDouble());

//        System.out.println("Area is: " + circle.getArea());
//
//        System.out.println("Circumference is: " + circle.getCircumference());

        System.out.println(circle.describeDate());

    }

}
