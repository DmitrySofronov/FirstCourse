package lab6.Task9;

import java.util.Arrays;

public class Task9 {
    public static void reverseArray(char[] array) {
        int mid = array.length / 2;
        for (int i = 0; i < mid; i++) {
            char temp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = temp;
        }
        System.out.println("Массив после преобразования: " + Arrays.toString(array) );
    }
}

