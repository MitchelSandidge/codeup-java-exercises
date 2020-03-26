package shapes;


public class Circle {

    private double radius;
    private boolean userCon;




    public Circle(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return (radius * radius) * Math.PI;
    }

    public double getCircumference() {
        return (radius * 2) * Math.PI;
    }

     public String describeDate() {
        StringBuilder sb = new StringBuilder("Circle Data\n");
        sb.append(String.format("Radius: %.3f\n",radius));
         sb.append(String.format("Area: %.3f\n",getArea()));
         sb.append(String.format("Circumference: %.3f\n",getCircumference()));
        return sb.toString();
     }

}



