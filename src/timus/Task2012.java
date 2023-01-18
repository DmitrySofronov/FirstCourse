package timus;

import java.util.Scanner;

public class Task2012 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int f = in.nextInt();
        int x = 12 - f;
        if (x * 45 <= 4 * 60) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}

