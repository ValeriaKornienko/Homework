package Exercise03;

public class CowDemo {

    public static void main(String[] args) {
        UserInput ui = new UserInput();
        System.out.println("Введите количество коров от 0 до 10: ");
        int numberOfCows = ui.userInputInt();
        Cow cow = new Cow();
        String ending = Cow.cowString(numberOfCows);
        System.out.println(ending);





    }
}
