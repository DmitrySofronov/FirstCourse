package lab1;

import java.util.Scanner;
import java.time.YearMonth;

public class task6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int year = YearMonth.now().getYear();
        System.out.println("Введите имя: ");
        String name = in.nextLine();

        System.out.println("Год рождения: ");
        int birth = in.nextInt();

        int age = year - birth;


        System.out.printf("имя: %s \nвозраст: %d \n", name, age);
        in.close();
    }
}
