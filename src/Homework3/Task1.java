package Homework3;

public class Task1 {


//    Найти максимальное значение из массива


    public static void main(String[] args) {


        int[] arr = {5, 17, 55, 23, 145};
        System.out.println(maxValue(arr));
    }

    public static int maxValue(int[] arr){

        int max = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {

                max = arr[i];

            }
        }

        return max;

    }

}
