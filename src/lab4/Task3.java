package lab4;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner id = new Scanner(System.in);
        System.out.print("ширина: ");
        int a = id.nextInt(); // количество столбцов
        System.out.print("высота: ");
        int b = id.nextInt(); // количество строк

        int[][] twoArr = new int[b][a]; //создаём массив заданных размеров
        int c = 0; //переменная для вывода к-ва символов

        for (int i = 0; i < b; i++) {
            for (int j = 0; j < a; j++) {
                twoArr[i][j] = 2;
            }
        }
        //вывод массива в консоль:
        for (int i = 0; i < b; i++) {
            int d = i + 1; //переменная для увеличения номера индекса элемента массива для вывода в консоль
            System.out.print("строка " + d + ":\t" );
            for (int j = 0; j < a; j++) {
                System.out.print(twoArr[i][j] + " ");
                c++;
            }
            System.out.println("\tсимволов в строке - " + c);
            c = 0; //обнуляем счетчик
        }
    }
}

/*Напишите программу, в которой создается двумерный массив,
который выводит прямоугольник из цифр 2*/

//&  int i = 65;
//
//        char c = (char) i;
//        System.out.println(c);