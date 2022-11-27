package lab1;

import java.util.Scanner;

public class task6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите имя: ");
        String name = in.nextLine();

        System.out.println("Год рождения: ");
        int birth = in.nextInt();

        int age = 2022 - birth;


        System.out.printf(" имя: %s, возраст: %d \n", name, age);
        in.close();
    }
}
