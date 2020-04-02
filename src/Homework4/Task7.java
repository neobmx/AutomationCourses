package Homework4;

//7. (Scanner) ОБЯЗЯТЕЛЬНО РЕШИТЬ !!!
//        Пользователь вводит слова по одному. Прервать ввод нужно написав в консоль "EXIT".
//        Рандомными образом расставить введенные слова чтобы получилась одна строка-предложение.


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Task7 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        List<String> saveStrings = new ArrayList<>();


        while (true) {
            String s = scanner.next();
            if (s.equalsIgnoreCase("exit")) {
              break;
            } else {
                saveStrings.add(s);
            }
        }
        Collections.shuffle(saveStrings);
        StringBuilder result = new StringBuilder();

        for (String s : saveStrings ) {
            result.append(s).append(" ");
        }
// append - добавляет         
// trim - удаляет пробельные символы в начале и в конце строки
        System.out.println(result.toString().trim());
    }

}


