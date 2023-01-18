package lab6.Task8;

public class Task8 {
    public static double getAverage(int[] array) {
        int sum = 0;
        for (int value : array) {
            sum += value;
        }
        System.out.println("Сумма элементов массива: " + sum);
        return (double) sum / array.length;
    }
}