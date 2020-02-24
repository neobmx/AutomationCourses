package Homework2;

public class Task15 {

//    Задача 15
//    Вывести все квадраты натуральных чисел, не превосходящие данного числа N.
//            Пример: N=50 | 1 4 9 16 25 36 49


    public static void main(String[] args) {

        System.out.println(squareNumbers(50));
    }

    private static int squareNumbers(int b) {

        int i = 1;
        while (i < b) {
            System.out.println(i * i);
            i++;

            if (i * i > b) {
                return 0;
            }
        }

        return  i;
    }



}
