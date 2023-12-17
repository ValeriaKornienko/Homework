package BinarySearch;

public class Example {
    public static void main(String[] args) {
        int[] sortedArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int target = 6;

        int result = BinarySearch.binarySearch(sortedArray, target);

        if (result == -1) {
            System.out.println("Элемент " + target + " не найден в массиве.");
        } else {
            System.out.println("Элемент " + target + " найден в массиве по индексу " + result);
        }
    }
}
