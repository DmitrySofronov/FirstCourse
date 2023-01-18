package timus;

import java.util.Scanner;

public class Task1264 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();

        int numberofM = m + 1;
        int result = n * numberofM;
        System.out.println(result);
    }
}

