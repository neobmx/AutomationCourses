package Homework4;

//2. (Scanner + String)
//        Перевернуть слова, т.е. последовательность слов остается, но слова написаны задом на перед.


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) {

        String string = "Zdarova rabotyagi kak gizn";

        String[] words = string.split(" ");
        StringBuilder revertedSentance = new StringBuilder();

        for (int i = 0; i < words.length; i++) {
            revertedSentance.append(revers(words[i])).append(" ");
        }
        System.out.println(revertedSentance.toString());

//        List<String> lol = new ArrayList<>();
//        lol.add("Sanyo4ek");
//        lol.add("Ulchik");
//        for (String s : lol) {
//            System.out.println(s);
//        }
    }

    public static String revers(String straight) {

        StringBuilder builder = new StringBuilder();

        for (int i = straight.length() - 1; i >= 0; i--) {
            builder.append(straight.charAt(i));
        }
        return builder.toString();
    }

}
