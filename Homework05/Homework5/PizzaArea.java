package Homework5;

public class PizzaArea {
    public static void main(String[] args) {
        double pizza24 = 24;
        double radiusPizza24 = pizza24 / 2;
        double areaPizza24 = Math.PI * radiusPizza24 * radiusPizza24;
        System.out.println(areaPizza24);
        double caloriesPizza24 = areaPizza24 * 40;
        System.out.println(caloriesPizza24);

        double pizza28 = 28;
        double radiusPizza28 = pizza28 / 2;
        double areaPizza28 = Math.PI * radiusPizza28 * radiusPizza28;
        System.out.println(areaPizza28);
        double caloriesPizza28 = areaPizza28 * 40;
        System.out.println(caloriesPizza28);

        double defCalories = caloriesPizza28 - caloriesPizza24;

        System.out.println("Если вы купите пиццу диаметром 28 см, вместо пиццы диаметром 24 см, у вас получится " +defCalories + "лишних калорий");


    }
}
