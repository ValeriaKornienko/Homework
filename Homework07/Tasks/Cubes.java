package Tasks;

import java.util.Scanner;

public class Cubes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число n: ");
        int n = scanner.nextInt();


        for (int i = 1; i <= n; i++) {
            int cube = i * i * i;
            System.out.println(i + " в кубе = " + cube);
        }

    }
}
