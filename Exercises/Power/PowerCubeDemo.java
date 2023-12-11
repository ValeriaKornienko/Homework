package Power;

import java.util.Scanner;
public class PowerCubeDemo {
    public static void main(String[] args) {
        PowerCube test = new PowerCube();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        int number = scanner.nextInt();

        System.out.println("Возведение числа " + number + " в степень 3: " + test.pow(number));
    }
}
