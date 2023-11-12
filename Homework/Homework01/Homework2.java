package Homework01;

public class Homework2 {
    public static void main(String[] args) {

        int Number = 456;
        int hundreds = Number / 100;
        int tens = (Number % 100) / 10;
        int units = Number % 10;

        System.out.println(hundreds);
        System.out.println(tens);
        System.out.println(units);
    }
}
