package lab1;

import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("input name: ");
        String name = in.nextLine();

        System.out.println("Input middle name: ");
        String middlename = in.nextLine();

        System.out.println("Input surname: ");
        String surname = in.nextLine();

        System.out.printf("Hello, %s %s %s! \n",name,middlename,surname);
        in.close();
    }
}
