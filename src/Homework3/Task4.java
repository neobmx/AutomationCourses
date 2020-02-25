package Homework3;


//Найти индекс числа из массива

public class Task4 {
    public static void main(String[] args) {

        int []arr = {0, 7, 95, 17, 34, 61, 6, 506, 11, 5};
        int index = findIndex(5, arr);
        System.out.println(index);
    }


    public static int findIndex(int number, int[]array) {

        for (int i = 0; i < array.length ; i++) {
            if (number == array[i]) {
             return i;
            }
        }
//        throw new IllegalArgumentException - бросить новое исключение.
        throw new IllegalArgumentException("No element in array");

    }

    

}
