package lab1;

import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите число: ");
        int x = in.nextInt();
        int q = x - 1;
        int w = x + 1;
        int s = x + q + w;

        System.out.printf("%d %d %d %.2f \n", q, x, w, Math.pow(s, 2) );
        in.close();
    }
}
