package Homework2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task3_1 {

    //Задача 3.1 (Scanner)
//    Из введенных чисел с разной четностью, вывести на экран сколько четных и сколько нечетных чисел было введено.
//    Пользователь вводит четные / нечетные числа. Последовательность их ввода может быть любой.
//            *Пользователь не может ввести меньше 2 чисел, в противном случае выводить об этом сообщение.


    public static void main(String[] args) {

        Scanner scaner = new Scanner(System.in);

        int even = 0;
        int odd = 0;
        int n1 = 0;

        while (true) {
            try {


            n1 = scaner.nextInt();

            if (n1 % 2 == 0) {
                even++;



            } else {
                odd++;

            }
        } catch (InputMismatchException e){
                break;
            }

        }

        System.out.println("Even " + even + " Odd " + odd);

    }






}
