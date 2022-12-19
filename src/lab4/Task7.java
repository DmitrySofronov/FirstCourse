package lab4;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner id = new Scanner(System.in);

        System.out.print("количество строк: ");
        int a = id.nextInt(); // количество столбцов
        System.out.print("количество столбцов: ");
        int b = id.nextInt(); // количество строк

        int[][] arr = new int[a][b]; //создаём массив заданных размеров
        int x = 0; //=h
        int y = 0; //=hvost
        int z = 0; //=telo

        //заполнение массива
        for (int i = 0; x < arr.length; x++) {
            for (int j = 0; j < (arr[i].length - y); j++) {
                arr[i][j] = z;
                z++;
            }
            if (i < arr.length - 1) {
                i++;
            }
            for (int k = a - 1; k > y; k--) {
                arr[k][arr[i].length - 1 - y] = z;
                z++;
            }
            y++;
        }
        int q = 0;
        for (int i = 0; i < arr.length; i++) {
            int c = i + 1;
            System.out.print("строка " + c + ": \t");
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
                q++;
            }
            System.out.println(" \tСимволов в строке - " + q);
            q = 0;
        }
    }
}

/*Напишите программу, в которой создается двумерный числовой
массив и этот массив заполняется «змейкой»: сначала первая
строка (слева направо), затем последний столбец (снизу вверх),
вторая строка (слева направо) и так далее*/