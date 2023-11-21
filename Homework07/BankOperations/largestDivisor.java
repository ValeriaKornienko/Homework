package BankOperations;

public class largestDivisor {
    public static void main(String[] args) {
        int number = 21;

        int largestDivisor = 1;

        // Используем цикл для поиска делителя
        for (int i = number / 2; i >= 1; i--) {
            if (number % i == 0) {
                largestDivisor = i;
                break; // Найден делитель, прекращаем поиск
            }
        }

        System.out.println("Самый большой делитель числа " + number + ": " + largestDivisor);
    }
}
