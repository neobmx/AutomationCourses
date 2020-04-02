package Homework4;

import java.util.Arrays;
import java.util.function.IntPredicate;

public class task1_1 {
    public static void main(String[] args) {

        String string = "Zdarova rabotyagi";

        char ch = 'a';
        long counter = string.chars().filter(value -> value == ch).count();

//        for (int i = 0; i < string.length() ; i++) {
//            if (string.charAt(i) == ch) {
//                counter++;
//            }
//
//        }
        System.out.println(counter);

//        String[] strArr = string.split("");
//        System.out.println(Arrays.toString(strArr));
//
//
//        String[] uniq = new String[string.length()];
//        for (int i = 0; i < string.length(); i++) {
//            uniq [i] = strArr[i];
//        }
    }
}
