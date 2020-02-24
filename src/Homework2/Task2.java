package Homework2;

import javafx.util.Pair;

public class Task2 {

    public static void main(String[] args) {

//        Задача 2
//        Обменять значения двух переменных, используя третью (буферную) переменную.


        int a = 13;
        int b = 24;

       a = a + b;
       b = a - b;
       a = a - b;

        System.out.println(a);
        System.out.println(b);
    }


}



