package AppInstrument;
import java.util.Scanner;
import java.util.Arrays;
public class AppSet {
    public static void main(String[] args) {
        Set[] sets = new Set[3];

        String item1;
        String item2;
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Набор 1: Введите название первого элемента: ");
        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Введите название второго элемента: ");
        sets[0] = new Set(scanner1.nextLine(), scanner2.nextLine());

        Scanner scanner3 = new Scanner(System.in);
        System.out.println("Набор 2: Введите название первого элемента: ");
        Scanner scanner4 = new Scanner(System.in);
        System.out.println("Введите название второго элемента: ");
        sets[1] = new Set(scanner3.nextLine(), scanner4.nextLine());

        Scanner scanner5 = new Scanner(System.in);
        System.out.println("Набор 3: Введите название первого элемента: ");
        Scanner scanner6 = new Scanner(System.in);
        System.out.println("Введите название второго элемента: ");
        sets[2] = new Set(scanner5.nextLine(), scanner6.nextLine());

        System.out.println(Arrays.toString(sets));

    }
}
