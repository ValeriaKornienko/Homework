package Homework5.Pizza;
import java.util.Scanner;
public class MathMethodsDemo {
    public static void main(String[] args) {
        MathMethods test = new MathMethods();
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter the first number: ");
        int x = input.nextInt();

        System.out.println("Please enter the second number: ");
        int y = input.nextInt();

        int add = test.add();
        System.out.println("Result of the additon: " +add);

        int sub = test.sub();
        System.out.println("Result of the subtraction: " +sub);

        int multpl = test.multpl();
        System.out.println("Result of the multiplication: " +multpl);

        int div = test.div();
        System.out.println("Result of the divion: " +div);



    }
}
