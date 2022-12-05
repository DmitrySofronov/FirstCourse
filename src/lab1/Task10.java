package lab1;

import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите первое число: ");
        int x = in.nextInt();

        System.out.println("Введите второе число: ");
        int y = in.nextInt();

        int sum = x + y;
        int diff1 = x - y;
        int diff2 = y - x;

        System.out.printf("Сумма чисел: %d Разность чисел в порядке ввода: %d Разность чисел в обратном порядке: %d \n", sum, diff1, diff2);
        in.close();
    }
}
