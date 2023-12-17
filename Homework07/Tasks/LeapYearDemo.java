package Tasks;
import java.util.Scanner;
public class LeapYearDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите год: ");
        int year = scanner.nextInt();
        boolean result1 = year % 4 == 0;
        boolean result2 = year % 100 != 0;
        boolean result3 = year % 400 == 0;
        if (result1 && (result2 || result3)) {
            System.out.println(year + " год високосный");
        } else {
            System.out.println(year + " год не високосный");
        }

    }
}




