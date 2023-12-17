package Tasks;
import java.util.Random;
public class Task2 {
    public static void main(String[] args) {

        Random random = new Random();
        int x = random.nextInt(21) - 10;
        int y = random.nextInt(21) - 10;

        System.out.println("Координаты точки: (" + x + ", " + y + ")");


        if (x > 0 && y > 0) {
            System.out.println("Точка находится в первой четверти.");
        } else if (x < 0 && y > 0) {
            System.out.println("Точка находится во второй четверти.");
        } else if (x < 0 && y < 0) {
            System.out.println("Точка находится в третьей четверти.");
        } else if (x > 0 && y < 0) {
            System.out.println("Точка находится в четвёртой четверти.");
        } else if (x == 0 && y != 0) {
            System.out.println("Точка лежит на оси Y.");
        } else if (x != 0 && y == 0) {
            System.out.println("Точка лежит на оси X.");
        } else {
            System.out.println("Точка находится в начале координат.");
        }
    }
}
