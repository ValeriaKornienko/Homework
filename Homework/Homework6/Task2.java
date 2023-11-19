package Homework6;

import java.util.Scanner;
public class Task2 {
    public static void main(String[] args) {
        int Temperature1;
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Температура первой колбы ровна -> ");
        Temperature1 = scanner1.nextShort();
        int Temperature2;
        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Температура второй колбы ровна -> ");
        Temperature2 = scanner2.nextShort();

        if(Temperature1 > 100 && Temperature2 < 100){
            boolean gadgetWork = true;
            System.out.println(gadgetWork);

        }else{
            boolean gadgetWork = false;
            System.out.println(gadgetWork);

        }


    }

}
