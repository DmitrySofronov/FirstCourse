package lab1;

import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("День недели: ");
        String day = in.nextLine();

        System.out.println("Месяц: ");
        String month = in.nextLine();

        System.out.println("Дата: ");
        int date = in.nextInt();

        System.out.printf(" %s %d %s \n", day, date, month);
        in.close();
    }
}
