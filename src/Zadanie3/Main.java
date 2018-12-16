package Zadanie3;

import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {

        SortedWordsFromFile sortedWordsFromFile = new SortedWordsFromFile("plik.txt");
        System.out.println(sortedWordsFromFile.readedText);

        String[] wordsArray = sortedWordsFromFile.getWords();
        for (String word : wordsArray) {
            System.out.println(word);
        }

        System.out.println(sortedWordsFromFile.getWordsCount());
    }
}
