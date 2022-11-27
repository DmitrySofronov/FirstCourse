package timus;

import java.util.Scanner;

public class task1409 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int G = in.nextInt();
        int L = in.nextInt();
        int Garry = L-1;
        int Larry  = G-1;

        System.out.printf("%d %d\n", Garry, Larry);
        in.close();
    }
}
