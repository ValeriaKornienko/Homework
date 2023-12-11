package LeapYear;

import java.util.Scanner;

public class LeapDemo {
    public static void main(String[] args) {
        LeapYear leapYear = new LeapYear();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите год: ");
        int year = scanner.nextInt();
        if(LeapYear.LeapYear(year)){
            System.out.println( year + " год високосный");
        }else {
            System.out.println(year + " год не високосный");
        }

    }
}
