package Homework03;

public class tempAverage {
    public static void main(String[] args) {
        double day1 = 12.9;
        double day2 = 10.8;
        double day3 = 10.1;
        double day4 = 10.8;
        double day5 = 10.6;
        double day6 = 7.2;
        double day7 = 8.0;
        double numberDays = 7.0;
        double sum = day1 + day2 + day3 + day4 + day5 + day6 + day7;
        double average = sum / numberDays;

        System.out.println("Средняя температура за последнюю неделю " + average + "t°");
    }



}
