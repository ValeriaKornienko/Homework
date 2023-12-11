package Homework03;

public class DivisorDemo {
    public static void main(String[] args) {
        Divisor div = new Divisor();
        int division = div.division(149, 2);
        System.out.println(division);
// при деление на два остаток будет 1, при деление на 3 остаток будет 1 или 2
    }
}
