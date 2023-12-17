package Tasks;

import java.sql.SQLOutput;

public class Task3Demo {
    public static void main(String[] args) {
        UserInput ui = new UserInput();
        System.out.println("Задайте количество коров:" );
        int n = ui.userIntegerInput();
        String cows = Task3.cowPhrase(n);
        System.out.println(cows);


    }
}
