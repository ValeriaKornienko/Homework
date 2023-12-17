package BinarySearch;

public class BinarySearch {
    public static int binarySearch(int[] array, int target) {
        int left = 0;
        int right = array.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (array[mid] == target) {
                return mid; // Элемент найден
            } else if (array[mid] < target) {
                left = mid + 1; // Искать в правой половине
            } else {
                right = mid - 1; // Искать в левой половине
            }
        }

        return -1; // Элемент не найден
    }
}
