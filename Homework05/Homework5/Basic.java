package Homework5;

import static Homework5.Char.printLastCharacter;

public class Basic {

    public static void main(String[] args) {
        String myString = new String("I study Basic Java!");
        printLastCharacter(myString);

        boolean containsJava = myString.contains("Java");
        System.out.println("Содержит подстроку 'Java': " + containsJava);


        String replacedString = myString.replace('a', 'o');
        System.out.println("Строка после замены: " + replacedString);


        String upperCaseString = myString.toUpperCase();
        System.out.println("Строка в верхнем регистре: " + upperCaseString);


        String lowerCaseString = myString.toLowerCase();
        System.out.println("Строка в нижнем регистре: " + lowerCaseString);

        String substringJava = myString.substring(myString.indexOf("Java"), myString.indexOf("Java") + "Java".length());
        System.out.println("Вырезанная подстрока: " + substringJava);
    }



}
