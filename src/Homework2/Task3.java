package Homework2;

import java.util.Scanner;

public class Task3 {

//    Задача 3
//    Из двух чисел с разной четностью, вывести на экран нечетное число.
//    Пользователь вводит четное и нечетное число. Последовательность их ввода может быть любой.
//            *Пользователь не может ввести меньше 2 чисел, в противном случае выводить об этом сообщение.

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n1 = scanner.nextInt();
        int n2 = scanner.nextInt();

    }

    private static int findOddNumber(int n1, int n2) {

        if ((n1 % 2) == 0) {
            return n1;
        }
        return n1;
    }
}