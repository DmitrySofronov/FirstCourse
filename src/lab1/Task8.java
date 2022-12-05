package lab1;

import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите первое число: ");
        int x = in.nextInt();

        System.out.println("Введите второе число: ");
        int y = in.nextInt();

        int sum = x + y;

        System.out.printf("Сумма чисел: %d \n", sum);
        in.close();
    }
}
