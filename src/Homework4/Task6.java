package Homework4;

public class Task6 {

    public static void main(String[] args) {

        String string = "My name Roman";
        String[] newString = string.split(" ");


        for (int i = 0; i < newString.length; i++) {
            for (int j = 0; j < newString.length - 1 - i; j++) {
                if(newString[j].length() > newString[j + 1].length()){
                    String str = newString[j];
                    newString[j] = newString[j + 1];
                    newString[j + 1] = str;
                }
            }

        }

        for (String s : newString){
            System.out.println(s);
        }


    }

}


