package lab6.Task5;

import java.util.Scanner;

public class Task5 {
    static void sqrSum (){
        Scanner in = new Scanner(System.in);

        System.out.print("введите натуральное число: ");
        int a = in.nextInt();
        int b = 0;
        int j = 0;
        int c = 2;

        if(a>=1){
            for (int i = 0; i <= a; i++){
                b = (int)Math.pow(j,c) + b;
                j++;
            }
            int z = (a*(a+1)*(2*a+1)/6);
            boolean test;
            test = b==z;
            String check;
            if(test){
                check = "значение верно";
            }else {
                check = "значение не верно";
            }
            System.out.println("сумма квадратов натуральных чисел от 1 до "+a+" равна: " + b + " ("+check+")");
        }else{
            System.out.println("введено некорректное значение");
        }
    }
}
