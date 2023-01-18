package lab6.Task9;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        char[] array = {'a', 'b', 'c', 'd', 'e','f'};
        System.out.println("Массив до преобразования: " + Arrays.toString(array) );
        Task9.reverseArray(array);

    }
}

/*
Напишите программу со статическим методом, аргументом которому
передается одномерный символьный массив. В результате вызова
метода элементы массива попарно меняются местами: первый — с
последним, второй — с предпоследним и так далее.
 */