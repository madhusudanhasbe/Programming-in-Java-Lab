package Assignment5_1;

public class Rectangle implements Shapes {
    private double breadth;
    private double length;

    public void setSize(double breadth, double length) {
        this.breadth = breadth;
        this.length = length;
    }


    @Override
    public double area() {
        return (breadth * length);
    }

    @Override
    public double perimeter() {
        return (2 * (length + breadth));
    }
}
