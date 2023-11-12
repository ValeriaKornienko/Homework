package Homework02;

public class Discount {
    public static void main(String[] args) {
        int articleA = 1000;
        int articleB = 500;
        int discount = 100;
        int endPrice = articleA + articleB - discount;

        System.out.println("Общая сумма покупки состовляет " +endPrice + "р.");
        System.out.println("Сумма скидки на эту покупку составляет " + discount + "р.");
    }
}
