package Shape;

import java.util.Scanner;

public class ShapeDemo {

    public static void main(String[] args) {
        Circle circle1 = new Circle("Circle", 5);
        Rectangle rectangle1 = new Rectangle("Rectangle", 5,10);
        Square square1 = new Square("Square", 5);
        Shape[] shapes = {circle1, rectangle1, square1};

        for (int i = 0; i < shapes.length; i++) {
            shapes[i].calculatorArea();
            shapes[i].calculatorPerimeter();
        }
    }
}
