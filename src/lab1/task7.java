package lab1;

import java.time.YearMonth;
import java.util.Scanner;

public class task7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int year = YearMonth.now().getYear();

        System.out.println("Введите возраст: ");
        int age = in.nextInt();

        int birth = year - age;

        System.out.printf("Ваш год рождения: %d \n", birth);
        in.close();
    }
}
