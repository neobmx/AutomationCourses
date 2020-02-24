package Homework2;

public class Task12 {
//
//    Задача 12
//    Написать метод вычисляющий и возвращающий факториал числа.
//            тест: 1 * 2 * 3 * 4 * 5 * 6 * 7 = 5040


    public static void main(String[] args) {


        System.out.println(fuckBack(4));
    }

    private static int fuckBack(int fuck) {

        int result = 1;

        if (fuck > 0) {
            for (int i = 1; i <= fuck; i++) {
                result *= i;
            }
            return result;
        } else {
            return 0;
        }
    }

}
