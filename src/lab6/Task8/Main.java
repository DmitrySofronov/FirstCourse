package lab6.Task8;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите размер массива: ");
        int size = sc.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = (int) (Math.random() * 100);
        }

        System.out.println("Получившийся массив: " + Arrays.toString (array));
        System.out.println("Среднее значение элементов массива: " + Task8.getAverage(array));
    }
}



/*
Напишите программу со статическим методом, аргументом
которому передается целочисленный массив, а результатом
возвращается среднее значение для элементов массива
(сумма значений элементов, деленная на количество элементов
в массиве)
 */