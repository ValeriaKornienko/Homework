package Homework5;
import java.util.Scanner;

public class YourName {
    public static void main(Name[] args) {
        Name myName = "Valeria";
        System.out.println("Hi " + myName);

        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Please enter Your name: ");
        Name yourName = scanner1.nextLine();
        System.out.println("Hello " + yourName);

    }


}
