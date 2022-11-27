package lab1;

import java.util.Scanner;

public class task7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите возраст: ");
        int age = in.nextInt();

        int birth = 2022 - age;

        System.out.printf("Ваш год рождения: %d \n", birth);
        in.close();
    }
}
