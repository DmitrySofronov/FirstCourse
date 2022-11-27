package lab1;

import java.util.Scanner;

public class task5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Год рождения: ");
        int birth = in.nextInt();

        System.out.println("Какой сейчас год: ");
        int thisyear = in.nextInt();

        int age = thisyear - birth;


        System.out.printf("Если вы родились в %d г., то в %d г. вам исполнилось (или исполнится) %d  \n", birth, thisyear, age);
        in.close();
    }
}
