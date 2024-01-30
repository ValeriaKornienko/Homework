package Homework5;

public class NewWord {
    public static void main(String[] args) {
        UserWordInput ui = new UserWordInput();

        String word1 = ui.userWordInput("Please enter translation word:");
        String word2 = ui.userWordInput("Please enter second word:");

        int word1length = word1.length()/2 ;
        String firstPart = word1.substring(0,word1length);

        int word2length = word2.length()/2 + word2.length() % 2;
        String secondPart = word2.substring(word2length);

        String finalWord = firstPart + secondPart;

        System.out.println(finalWord);


    }
}
