package lab2;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println(" введите целое число большее 10, которое делится на 4 без остатка");

        int a = in.nextInt();

        if ( a > 10 && a % 4 == 0 ) {
            System.out.println(" число подходит под условия, спасибо");
        }else{
            System.out.println(" число не подходит под условия, попробуйте другое число ");
        }
        in.close();
    }
}
    /*Напишите программу, которая проверяет, удовлетворяет ли введенное
        пользователем число следующим критериям: число делится на 4, и при
        этом оно не меньше 10.*/