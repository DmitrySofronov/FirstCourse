package lab4;

import java.util.Random;
import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner id = new Scanner(System.in);

        System.out.print("количество столбцов: ");
        int a = id.nextInt(); // количество столбцов
        System.out.print("количество строк: ");
        int b = id.nextInt(); // количество строк

        int[][] arr = new int[b][a]; //создаём массив заданных размеров

        //заполнение массива
        for (int i = 0; i < b; i++) {
            for (int j = 0; j < a; j++) {
                arr[i][j] = random.nextInt(100);
            }
        }
        //вывод заполненного массива в консоль
        System.out.println("\nмассив до удаления строки и столбца\n");
        for (int i = 0; i < b; i++) {
            int d = i + 1;
            System.out.print("строка " + d + ":\t");
            for (int j = 0; j < a; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        //удаление строки и столбца

        int x = random.nextInt(a-1);;
        int y = random.nextInt(b-1);;

        System.out.println("\nудаляем строку номер " + (y+1));
        System.out.println("удаляем столбец номер " + (x+1));

        int [][] arr2 = new int[b - 1][a - 1];
        System.out.println("\nмассив после удаления строки и столбца");

        for (int i = 0, k = 0; i < b-1; k++) {
            if (k != y){
                int d = k + 1;
                System.out.print("строка " + d + ":\t" );
                for (int j = 0, z = 0; j < a-1; z++) {
                    if (z != x) {
                        arr2 [i][j] = arr [k][z];
                        System.out.print(arr2[i][j] + " ");
                        j++;
                    }
                }
                i++;
            }
            System.out.println();
        }
    }
}

/*Напишите программу, в которой создается и инициализируется
двумерный числовой массив. Затем из этого массива удаляется
строка и столбец (создается новый массив, в котором по сравнению
с исходным удалена одна строка и один столбец). Индекс удаляемой
строки и индекс удаляемого столбца определяется с помощью
генератора случайных чисел*/