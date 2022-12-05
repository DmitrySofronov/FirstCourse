package lab1;

import java.util.Scanner;


public class Task4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Месяц: ");
        String month = in.nextLine();

        System.out.println("Количество дней: ");
        int number = in.nextInt();

        System.out.printf("В месяце %S количество дней равно %d \n", month, number);
        in.close();
    }
}
