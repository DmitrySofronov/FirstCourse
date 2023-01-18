package lab6.Task6;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] array = {-5,-4,-3,-2,-1,0,1, 2, 3, 4, 5};

        System.out.print("введите число: ");
        int num = in.nextInt();
        int[] newArray = getSubArray(array, num);

        if (num <= array.length){
            System.out.println("число меньшее, либо равное размеру исходного массива.\nновый массив: ");
        }
        System.out.println(Arrays.toString(newArray));
    }

    public static int[] getSubArray(int[] array, int num) {
        if (num > array.length) {
            System.out.println("число превышает размер исходного массива. \nкопия исходного массива: ");
            return array.clone();
        }
        int[] newArray = new int[num];
        for (int i = 0; i < num; i++) {
            newArray[i] = array[i];
        }
        return newArray;
    }


}

/*
Напишите программу со статическим методом, которому аргументом
передается целочисленный массив и целое число.
Результатом метод возвращает ссылку на новый массив, который
получается из исходного массива (переданного первым аргументом
методу), если в нем взять несколько начальных элементов.
-Количество элементов, которые нужно взять из исходного массива,
определяются вторым аргументом метода.
-Если второй аргумент метода больше длины массива, переданного первым
аргументом, то методом создается копия исходного массива и возвращается
ссылка на эту копию
 */