package lab6.Task10;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите количество целочисленных аргументов: ");
        int size = sc.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = (int) (Math.random() * 100);
        }
        System.out.println("Переданные аргументы: " + Arrays.toString (array));
        int[] result = Task10.minMax(array);
        System.out.println("Min: " + result[0] + ", Max: " + result[1]);
    }
}

/*
Напишите программу со статическим методом, аргументом которому
передается произвольное количество целочисленных аргументов.
Результатом метод возвращает массив из двух элементов:
это значения наибольшего и наименьшего значений среди
аргументов, переданных методу
 */