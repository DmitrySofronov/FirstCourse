package lab2;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println(" введите целое число, которое при делении на 5 даёт в остатке 2, а при делении на 7 даёт в остатке 1 ");

        int a = in.nextInt();

        if (a % 7 == 1 && a % 5 == 2) {
            System.out.println(" то что нужно ");

        } else {
            System.out.println(" попробуйте другое число ");
            in.close();
        }
    }
}/* Напишите программу, которая проверяет, удовлетворяет ли введенное
    пользователем число следующим критериям: при делении на 5 в остатке
        получается 2, а при делении на 7 в остатке получается 1.*/