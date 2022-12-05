package lab2;

import java.util.Scanner;

public class Task5 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println(" введите любое целое число большее 999 ");

        int a = in.nextInt();

        if (a > 999) {
            System.out.printf(" тысяч в чмсле: %d ", a % 10000/1000);
        } else {
            System.out.println("вы ввели число меньше 999, повторите попытку ");
        }

    }
}


/*Напишите программу, которая проверяет, сколько тысяч во введенном
пользователем числе (определяется четвертая цифра справа в десятичном
представлении числа)*/