package Lab3;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Lab3 {
    public static void main(String[] args) {

        /*
            C3 = 20 % 3 = 2 (String)
            C17 = 20 % 17 = 3 (В усіх питальних реченнях заданого тексту знайти та надрукувати без повторень слова заданої довжини.)
         */

        Scanner scanner = new Scanner(System.in);

        String text = "Я бы бы бы хотел, чтобы меня называли все талант! Но но уже есть один талант под (псевдонимом)2 skorpion? А. було?";

        System.out.println("Введіть довжину рядка:");

        final int wordLength = scanner.nextInt();

        Pattern pattern = Pattern.compile("[^.!?]+(?=\\?)");
        Matcher matches = pattern.matcher(text);

        String questionSentences = "";
        while(matches.find())
            questionSentences += matches.group();


        String clearedText = questionSentences.replaceAll("[^а-яА-Яa-zA-ZЇїкєЕi]+", "\s").replaceAll("\\s+", "\s").trim();

        String[] wordList = clearedText.split("\s");

        System.out.println("Найдені слова:");

        ArrayList<String> printedWords = new ArrayList<String>();
        for(String word : wordList)
        {
            if(word.length() == wordLength && !printedWords.contains(word.toLowerCase()))
            {
                System.out.println(word);
                printedWords.add(word.toLowerCase());
            }
        }

    }
}
