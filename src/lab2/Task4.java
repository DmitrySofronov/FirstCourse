package lab2;

import java.util.Scanner;

public class Task4 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println(" введите целое число ");

        int a = in.nextInt();

        if ( a >= 5 && a <= 10){
            System.out.println(" ваше число попадает в диапозон от 5 до 10 включительно ");
        } else {
            System.out.println(" ваше число не попадает в диапозон от 5 до 10 включительно ");
        }
           in.close();
    }


}
/*Напишите программу, которая проверяет, попадает ли введённое
пользователем число в диапазон от 5 до 10 включительно*/