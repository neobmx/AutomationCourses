package Homework4;

import java.util.Arrays;

public class Task1 {


    public static void main(String[] args) {
        String string = "Hello, world! My name is Dimon =)";
        String[] split = string.split(" ");
        int[] count = new int[split.length];

        System.out.println(Arrays.toString(split));

        for (int i = 0; i < split.length; i++) {
             count[i] = split[i].length();

        }
        System.out.println(Arrays.toString(count));
    }

}
