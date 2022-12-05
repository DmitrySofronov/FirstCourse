package lab1;

import java.time.YearMonth;
import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int year = YearMonth.now().getYear();

        System.out.println("Год рождения: ");
        int birth = in.nextInt();

        int age = year - birth;

        System.out.printf("Если вы родились в %d г., то вам исполнилось (или исполнится до конца текущего года) %d  \n", birth, age);
        in.close();
    }
}
