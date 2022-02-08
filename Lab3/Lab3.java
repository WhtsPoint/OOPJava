package Lab3;

import java.util.Locale;
import java.util.Scanner;

public class Lab3 {
    public static void main(String[] args) {


        /*
            C3 = 20 % 3 = 2 (String)
            C17 = 20 % 17 = 3 (Знайти таке слово в першому реченні заданого тексту, якого не має в жодному з наступних.)
         */

        Scanner scanner = new Scanner(System.in);

        String text = "Я бы бы бы хотел, чтобы меня называли все талант. Но но уже есть один талант под псевдонимом skorpion!";

        System.out.println("Введіть довжину рядка:");

        final int wordLength = scanner.nextInt();


        String clearedText = text.replaceAll("\\?|\\!|\\.|\\,|\\-|\\:", "\s").replaceAll("\\s+", "\s");

        String[] wordList = clearedText.split("\s");

        System.out.println("Найдені слова:");

        String printedWords = "";
        for(String word : wordList)
        {
            if(word.length() == wordLength && !printedWords.contains(word.toLowerCase()))
            {
                System.out.println(word);
                printedWords += word.toLowerCase();
            }
        }

    }
}
