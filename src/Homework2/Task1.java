package Homework2;

import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {

//        Задача 1:
//        Определить какое из трех, введенных пользователем, чисел максимальное и вывести его на экран.

        Scanner scaner = new Scanner(System.in);
        int n1 = scaner.nextInt();
        int n2 = scaner.nextInt();
        int n3 = scaner.nextInt();

        System.out.println(findMax(n1, n2, n3));


    }

    static int findMax (int n1, int n2, int n3) {
        if (n1 > n2) {
            return n1 > n3 ? n1 : n3 ;
        } else {
            return n2 > n3 ? n2 : n3;

            }
        }
    }

