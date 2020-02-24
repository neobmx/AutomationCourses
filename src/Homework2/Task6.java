package Homework2;

public class Task6 {

    public static void main(String[] args) {


//        Задача 6
//        Определить, кратно ли заданное число трем; если нет, вывести остаток.

        System.out.println(multiple3(5));
        System.out.println(multiple3(50));
        System.out.println(multiple3(30));

    }



    private static int multiple3 (int a) {

        if (a % 3 == 0){
            return a;

        } else {
            return a % 3;
        }
    }



}
