package Homework1;

public class Task1 {
    static final int ABV = 5;

    public static void main(String[] args) {

        float i = 5f;
        double j = i + 5;
        int k = (int) j + 5 + (int) i;

        System.out.println(i + " " + j + " " + k);
        askii();
    }
// лонги, остаток по модулю
    static void longs() {
        long f1 = 986;
        long f2 = f1 % 100;

        System.out.println(f2);

    }
// переменная без инициализации
    static void nonInizilizated() {

        float i;
        i = 1;

    }
//аскии, чары, булиан, сумма чисел имени
    static void askii() {

        String name = "Dimon4ik";
        char ch;
        int sum = 0;
        for (int i = 0; i < name.length(); i++) {
            ch = name.charAt(i);
            System.out.println((int)ch);
            sum += ch;
        }
        System.out.println("\nSum: " + sum);
        System.out.println(sum > 800);
    }

 

}

