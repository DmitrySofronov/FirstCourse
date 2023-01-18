package lab6.Task4;

import java.util.Scanner;

public class Task4 {
    static void doubleFactorial(){
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число: ");
        int a = in.nextInt();
        int x = a;
        int j = x;
        for (int i = x; i > 2; i = i - 2){
            j = j - 2;
            x = x * j;
       }
        System.out.println("\nЗначение двойного факториала вашего числа равно "+a+"!! = " + x );
    }
}

