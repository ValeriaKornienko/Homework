package Shape;

public class Circle extends Shape{
    private double radius;

    public Circle(String title, double radius) {
        super(title);
        this.radius = radius;
    }

    @Override
    void calculatorArea() {
        double area = Math.PI * radius * radius;
        System.out.println("Area of the circle = " + area);
    }

    @Override
    void calculatorPerimeter() {
        double perimeter = 2 * Math.PI * radius;
        System.out.println("Perimeter of the circle = " + perimeter);

    }
}
