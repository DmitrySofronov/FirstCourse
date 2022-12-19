package lab4;

public class Task2 {
    public static void main(String[] args) {
        int katet1 = 10; // число строк
        int katet2 = 10; // число символов в первой строке

        for (int i = 1 ; i <= katet1; i++) {
            System.out.print("строка " + i + " \t");
            int z = 0;
            for (int j = i; j <= katet2; j++) {
                System.out.print("+");
                z = z + 1;
            }
            System.out.println("   Количество символов в строке " + z);

        }


        System.out.println("\nрешение наоборот:\n");

        int height = 10; // число столбцов которое необходимо вывести
        int z = 0; // переменная необходима для вывода служебного сообщения о количестве символов в строке;
        for (int i = 1; i <= height; i++) {
            System.out.print("строка " + i + " \t");
            for (int j = 0; j <= z; j++) {
            System.out.print("+");
            }
            z = z + 1;
            System.out.println("   Количество символов в строке " + z);
        }
    }
}


/*Напишите программу, которая выводит в консольное окно
прямоугольный треугольник;*/

