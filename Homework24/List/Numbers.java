package List;
import java.util.LinkedList;
import java.util.Random;
import java.util.Collections;

public class Numbers {
    public static void main(String[] args) {

        LinkedList<Integer> linkedList = new LinkedList<>();

        Random random = new Random();
        int size = 10;
        for (int i = 0; i < size; i++) {
            int randomNumber = random.nextInt(100) + 1;
            linkedList.add(randomNumber);
        }
        System.out.println("Список случайных чисел: " + linkedList);

        int maxNumber = Collections.max(linkedList);
        System.out.println("Максимальное число: " + maxNumber);

        int minNumber = Collections.min(linkedList);
        System.out.println("Минимальное число: " + minNumber);

        Collections.sort(linkedList);


        System.out.println("Отсортированный список: " + linkedList);
    }
}
