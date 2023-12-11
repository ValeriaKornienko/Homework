package Multiplication;
import java.util.Scanner;
public class MultiDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите x: ");
        int x = scanner.nextInt();
        for(int i = 0; i <= x; i++){
            System.out.println("Число " + x + " умножить на " + i + " = " + (i*x));
        }

    }
}
