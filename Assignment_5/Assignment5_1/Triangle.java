package Assignment5_1;

public class Triangle implements Shapes {

    private double sideA;
    private double sideB;
    private double sideC;

    public void setSide(double sideA, double sideB, double sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    @Override
    public double area() {
        if (sideA < 0 && sideB < 0 && sideC < 0 && (sideA + sideB <= sideC) && sideA + sideC <= sideB && sideB + sideC <= sideA) {
            System.out.println("Not a valid input");
            System.exit(0);
        }
        float SidePerimeter = (float) (sideA + sideB + sideC) / 2;

        return (float) Math.sqrt(SidePerimeter * (SidePerimeter - sideA) * (SidePerimeter - sideB) * (SidePerimeter - sideC));
    }

    @Override
    public double perimeter() {
        if ((sideA < 0) && (sideB < 0) && (sideC < 0) && (sideA + sideB <= sideC) && (sideA + sideC <= sideB) && (sideB + sideC <= sideA)) {
            System.out.println("Not a valid input");
            System.exit(0);
        }
        return sideA + sideB + sideC;
    }
}
