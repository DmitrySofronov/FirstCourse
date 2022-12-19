package lab4;

import java.util.Random;
import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner id = new Scanner(System.in);

        System.out.print("количество столбцов: ");
        int a = id.nextInt(); // количество столбцов
        System.out.print("количество строк: ");
        int b = id.nextInt(); // количество строк

        int [][] arr = new int[b][a]; //создаём массив заданных размеров

        //заполнение массива
        for (int i = 0; i < b; i++){
            for (int j = 0; j < a; j++) {
                arr [i][j] = random.nextInt(100);
            }
        }
        //вывод заполненного массива в консоль
        System.out.println("массив до перестановки");
        for (int i = 0; i < b; i++) {
            int d = i + 1;
            System.out.print("строка " + d + ":\t" );
            for (int j = 0; j < a; j ++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        //перестановка местами строк и столбцов
        int [][] arr2 = new int[a][b];
        System.out.println("массив после перестановки");
        for (int i = 0; i < a; i++ ){
            for (int j = 0; j < b; j++){
                arr2 [i][j] = arr [j][i];
                System.out.print(arr2[i][j] + " ");
            }
            System.out.println();
        }
    }
}

/*Напишите программу, в которой создается двумерный
целочисленный массив. Он заполняется случайными числами.
Затем в этом массиве строки и столбцы меняются местами:
первая строка становится первым столбцом,
вторая строка становиться вторым столбцом и так далее.
Например, если исходный массив состоял из 3 строк и 5 столбцов,
то в итоге получаем массив из 5 строк и 3 столбцов*/