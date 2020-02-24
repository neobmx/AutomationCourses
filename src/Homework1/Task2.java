package Homework1;

public class Task2 {

//    public static void main(String[] args) {

//        for (int i = 1; i <= 100;i++ ) {
//            for (int j = 2; j <= 100; j ){
//                System.out.println(j);
//            }
//        }
//
//    }

    public static void main (String[] args) {

        int a = 1;
        int b = 1;

        for (int i = 0; i < 100 ; i++) {
            b = a + b ;
            a = b - a;


                System.out.println();

        }
    }
}
