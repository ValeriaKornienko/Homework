package Homework5;

public class Char {
    public static void printLastCharacter(String str) {
        char lastCharacter = str.charAt(str.length() - 1);
        System.out.println("Последний символ строки: " + lastCharacter);
    }
}
