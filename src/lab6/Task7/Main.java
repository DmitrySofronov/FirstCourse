package lab6.Task7;

import static lab6.Task7.Task7.getIntArray;

public class Main {
    public static void main(String[] args) {
        char[] charArray = {'a', 'B', 'c'};
        int[] intArray = getIntArray(charArray);
        for (int i = 0; i < intArray.length; i++) {
            System.out.println(intArray[i]);
        }
    }
}


/*
Напишите программу со статическим методом,
аргументом которому передастся символьный
массив, а результатом возвращается ссылка
на целочисленным массив, состоящий из
кодов символов из массива-аргумента
 */