package shapes;

abstract class Quadrilateral extends Shape implements Measurable {

    // Initiating Length and Width
    protected int length;
    protected int width;


    // Constructor
    public Quadrilateral(int length, int width) {
        this.length = length;
        this.width = width;
    }


    // Getters and Setters
    public int getLength() {
        return length;
    }
    public void setLength(int length) {
        this.length = length;
    }
    public int getWidth() {
        return width;
    }
    public void setWidth(int width) {
        this.width = width;
    }
}
