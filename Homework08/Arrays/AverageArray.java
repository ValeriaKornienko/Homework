package Arrays;

public class AverageArray {
    public static double calculateAverage(int[] array) {
        if (array == null || array.length == 0) {
            return 0; // Возвращаем 0, если массив пуст
        }

        int sum = 0;

        // Суммируем все элементы массива
        for (int number : array) {
            sum += number;
        }

        // Вычисляем среднее значение
        return (double) sum / array.length;
    }
}
