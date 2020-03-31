package shapes;

// Class that extends from rectangle class
public class Square extends Rectangle {

    public Square(int side) {
        super(side, side);
    }


    @Override
    public int getArea() {
        System.out.println("In Square");
        return length * length;
    }
    @Override
    public int getPerimeter() {
        System.out.println("In Square");
        return length * 4;
    }

}
