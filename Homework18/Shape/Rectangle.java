package Shape;

public class Rectangle extends Shape{

    private double sideA;
    private double sideB;
    public Rectangle(String title, double sideA, double sideB) {
        super(title);

        this.sideA = sideA;
        this.sideB = sideB;
    }

    @Override
    void calculatorArea() {
        double area =  sideA * sideB;
        System.out.println("Area of the rectangle = " + area);
    }

    @Override
    void calculatorPerimeter() {
        double perimeter = 2 * (sideA + sideB);
        System.out.println("Perimeter of the rectangle = " + perimeter);
    }
}
