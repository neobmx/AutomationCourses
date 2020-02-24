package Homework3;

public class Task3 {


//    Перестановка элементов массива в обратном порядке

    public static void main(String[] args) {

        int[] arr = {10, 34, 15, 23, 111};
        int[] invert = invert(arr);
        for (int i = 0; i < invert.length; i++) {
            System.out.println(invert[i]);
        }
    }

    public static int[] invert(int[] swap) {

        int[] inverted = new int[swap.length];

        for (int i = 0; i < swap.length; i++) {
            inverted[swap.length - 1 - i] = swap[i];

        }
        return inverted;
    }

}


