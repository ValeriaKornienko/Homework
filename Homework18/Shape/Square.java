package Shape;

public class Square extends Shape{

    private double sideA;
    public Square(String title, double sideA) {
        super(title);
        this. sideA = sideA;
    }

    @Override
    void calculatorArea() {
        double area = sideA * sideA;
        System.out.println("Area of the square = " + area);
    }

    @Override
    void calculatorPerimeter() {
        double perimeter = 4 * sideA;
        System.out.println("Perimeter of the square = " + perimeter);
    }
}
