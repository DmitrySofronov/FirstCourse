package lab4;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner id = new Scanner(System.in);

        System.out.print("введите высоту треугольника: ");
        int a = id.nextInt(); // число строк которое необходимо вывести
        int [][] arr = new int [a][]; //создание элемента массива необходимого размера
        for (int i=0;i<arr.length;i++){//резервирование памяти для второго измерения массива
            int j = i+1;
            arr[i]=new int[j];
        }

        int b = 0; //переменная для вывода к-ва строк

        for (int i =0; i < arr.length; i++){//заполнение массива
            for (int j = 0; j <i+1; j++){

                arr[i][j] = 0;
            }
        }
        for (int i =0; i < a; i++){//вывод массива
            int c = i+1;//переменная для повышения номера индекса для вывода на консоль
            System.out.print("строка " + c + ":\t");
            for (int j = 0; j < arr[i].length; j++){
                System.out.print(arr[i][j]+" ");
                b++;
            }
            System.out.println("   Количество символов в строке " + b);
            b = 0; //обнуление счетчика
        }
    }
}

/*Напишите программу, в которой создается двумерный массив,
который выводит прямоугольный треугольник*/