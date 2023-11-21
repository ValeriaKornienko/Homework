package Lift;

public class Lift {
    public static void main(String[] args) {
        UserInput input = new UserInput();
        System.out.println("Введите высоту здания: ");
        int floor = input.userIntegerInput();
        System.out.println("Введите количество этажей для подъема: ");
        int stepUp = input.userIntegerInput();
        System.out.println("Введите количество этажей для спуска: ");
        int stepDown = input.userIntegerInput();

        int currentFloor = 0;
        int iteration = 0;

        while (true) {
            currentFloor = currentFloor + stepUp;
            iteration++;

            if (currentFloor >= floor) {
                break;
            }
            currentFloor = currentFloor - stepDown;


        }
        System.out.println("Количество подъмов: " +iteration);
    }
}
