package Exercise03;
import java.util.Scanner;

public class UserInput {
        Scanner scanner = new Scanner(System.in);
        public int userInputInt(){
            int numberOfCows = scanner.nextInt();
            return numberOfCows;
    }
}
