package timus;

import java.util.Scanner;

public class task1293 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int N = in.nextInt();
        int A = in.nextInt();
        int B = in.nextInt();
        int R = A * B * N*2;

        System.out.printf("%d\n", R);
        in.close();
    }
}
