package Homework2;

public class Task8 {


//    Задача 8 (switch-case)
//    Возрастная категория.
//    Пользователь вводит число от 1 до 100.
//    Разбить 100 летний отрезок по 10 лет образно обозначив их (пример: 0-10 - юнец, 30-40 - старЫк, 70-80 - столько не живут...)

    public static void main(String[] args) {
        System.out.println(checkAge(71));
    }

    private static String checkAge (final int age) {

        if (age <= 10 && age > 0) {

            return "Юнец";

        } else if (age >= 30 && age <= 40){

            return "СтарЫк";
        } else if (age >= 70 && age <= 80) {

            return "Столько не живут";
        } else {
            return "Другие";
        }

    }

}





