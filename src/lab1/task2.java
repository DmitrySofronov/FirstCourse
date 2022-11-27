package lab1;
import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("input name: ");
        String name = in.nextLine();

        System.out.println("Input age: ");
        int age = in.nextInt();

        System.out.printf("Name: %s Age: %d \n", name, age);
        in.close();
    }
}
