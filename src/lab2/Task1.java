package lab2;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println(" введите целое число ");

        int a = in.nextInt();

        if (a % 3 == 0) {
            System.out.println(" делится на 3 без остатка ");
        } else {
            System.out.println(" не делится на 3  без остатка ");
            in.close();
        }
    }
}

/*Напишите программу, которая проверяет, делится ли введенное
Пользователем число на 3.*/