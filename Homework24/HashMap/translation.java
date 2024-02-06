package HashMap;

import java.util.HashMap;
import java.util.Scanner;

public class translation {

    public static void main(String[] args) {
        HashMap<String,String > translate = new HashMap<>();
        translate.put("letter","письмо");
        translate.put("book","книга");
        translate.put("car","машина");
        translate.put("circus","цирк");
        translate.put("earth","земля");

        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Задайте слово для перевода. Letter, book, car, circus, earth.");
        String word = scanner1.nextLine();
        System.out.println(translate.get(word));

        translate.remove("book");
        System.out.println(translate);

    }
}
