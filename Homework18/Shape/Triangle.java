package Shape;

public class Triangle extends Shape{

    private double sideA;
    private double sideB;
    private double sideC;

    public Triangle(String title, double sideA, double sideB, double sideC) {
        super(title);
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    @Override
    void calculatorArea() {

    }

    @Override
    void calculatorPerimeter() {
        double perimeter = sideA + sideB + sideC;
        System.out.println("Perimeter of the triangle = " + perimeter);

    }
}
