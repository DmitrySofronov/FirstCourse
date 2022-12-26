package lab5.Task3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner id = new Scanner(System.in);
        System.out.print("Введите x: ");
        int int1 = id.nextInt();
        System.out.print("Введите y: ");
        int int2 = id.nextInt();
        Task3 task3_1 = new Task3();
        Task3 task3_2 = new Task3(int1);
        Task3 task3_3 = new Task3(int1,int2);

    }
}


