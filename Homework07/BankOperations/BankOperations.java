package BankOperations;

import Lift.UserInput;

public class BankOperations {
    public static void main(String[] args) {
        UserInput input = new UserInput();
        System.out.println("Введите сумму на счету: ");
        int balance = input.userIntegerInput();
        int days = 0;
        int largestDivisor = 1;


            while (balance > 0) {
                for (int divisor = balance / 2; divisor >= 1; divisor--) {
                    if (balance % divisor == 0) {
                        largestDivisor = divisor;
                        break;
                    }
                }
                balance = balance - largestDivisor;
                days++;

            }

        System.out.println("Вы сможете снять весь баланс за " + days + " дней.");


    }
}
