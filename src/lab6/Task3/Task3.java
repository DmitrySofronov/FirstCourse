package lab6.Task3;

public class Task3 {
    //наибольшее значение,
    static void maxValue(int... array) {
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            max = Math.max(max, array[i]);
        }
        System.out.println("Метод, позволяющий вычислить наибольшее значение: max = " + max);
    }

    //наименьшее значение,
    static void minValue(int... array) {
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            min = Math.min(min, array[i]);
        }
        System.out.println("Метод, позволяющий вычислить наименьшее значение: min = " + min);
    }

    //среднее значение из набора чисел.
    static void averageValue(int... array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum = array[i] + sum;
        }
        double average = (double) sum / array.length;
        System.out.println("Метод, позволяющий вычислить среднее значение: average = " + average);
    }
}
