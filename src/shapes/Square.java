package shapes;

// Class that extends from Quadrilateral class
public class Square extends Quadrilateral {


    public Square(int side) {
        super(side, side);
    }


    @Override
    public int getArea() {
        return length * length;
    }

    @Override
    public int getPerimeter() {
        return length * 4;
    }




// ---------- Exercise 1 ----------

//    public Square(int side) {
//        super(side, side);
//    }
//
//
//    @Override
//    public int getArea() {
//        System.out.println("In Square");
//        return length * length;
//    }
//    @Override
//    public int getPerimeter() {
//        System.out.println("In Square");
//        return length * 4;
//    }

}
