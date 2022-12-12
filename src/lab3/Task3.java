package lab3;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner id = new Scanner(System.in);
        System.out.println("Ввведите количество чисел Фибоначчи");
        int x = id.nextInt();

        Fib.WhileFib(x);
        Fib.ForFib(x);
    }

    static class Fib {
        static void WhileFib(int x) {
            System.out.println("\nоператор \"while\"");
            int i = x;
            long k = 0;
            long l = 1;
            long m = 1;
            while (i > 0) {
                System.out.printf("%d, ", m);
                m = k + l;
                k = l;
                l = m;
                i--;
            }

        }

        static void ForFib(int x) {
            System.out.println("\nоператор \"for\"");
            long k = 0;
            long l = 1;
            long m = 1;
            for (int x1 = x; x1 > 0; --x1) {
                System.out.printf("%d, ", m);
                m = k + l;
                k = l;
                l = m;
            }

        }
    }
}

/*Напишите программу, которая выводит последовательность чисел
Фибоначчи. Первые два числа в этой последовательности равны 1, а каждое
следующее число равно сумме двух предыдущих (получается последовательность 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89 и так далее). Количество чисел
в последовательности вводится пользователем. Предложите версии
программы, использующие разные операторы цикла.*/
