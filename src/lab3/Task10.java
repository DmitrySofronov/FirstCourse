package lab3;

import java.util.*;


public class Task10 {
    public static void main(String[] args) {
        Scanner id = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Введите размер массива");
        int Size = id.nextInt();

        System.out.println("Размер массива: "+ Size);

        int [] arr = new int[Size];


        for (int i = 0 ; i < arr.length ; i++ ){

            arr [i] = random.nextInt(100);
            System.out.println("Элемент массива ["+i+"] = " + arr[i]);
        }
        for(int i = arr.length ; i >= 0 ; i--) {
            for (int j = 0; j < i-1; j++) {
                if (arr[j] < arr[j + 1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                }
            }
        }
        System.out.println("Произведена сортировка массива");
        for (int i = 0 ; i < arr.length ; i++ ){
            System.out.println("Элемент массива ["+i+"] после сортировки =" + arr[i]);
        }
    }
}


/*Напишите программу, в которой создается целочисленный
массив, заполняется случайными числами и после этого значения элементов в
массиве сортируются в порядке убывания значений*/
