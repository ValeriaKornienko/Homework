package Shape;

public class Circle extends Shape{
    private final double radius;

    public Circle(String title, double radius) {
        super(title);
        this.radius = radius;
    }

    @Override
    double calculatorArea() {
        return Math.PI * radius * radius;
    }

    @Override
    double calculatorPerimeter() {
        return 2 * Math.PI * radius;

    }
}
