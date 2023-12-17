package Homework6;
import java.util.Random;
public class Task3 {
    public static void main(String[] args) {
        Random random = new Random();
        Task3Util util = new Task3Util();
        int numberSeconds = random.nextInt(28800);

        System.out.println("До конца работы " + numberSeconds + " секунд");
        System.out.println(util.fromSecToText(numberSeconds));



    }
}
