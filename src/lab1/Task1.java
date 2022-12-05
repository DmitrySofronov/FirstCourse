package lab1;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите имя: ");
        String name = in.nextLine();

        System.out.println("Введите отчество: ");
        String middlename = in.nextLine();

        System.out.println("Введите фамилию: ");
        String surname = in.nextLine();

        System.out.printf("Hello, %s %s %s! \n",name,middlename,surname);
        in.close();
    }
}
