package lab6.Task10;

public class Task10 {
    public static int[] minMax(int... numbers) {
        int min = numbers[0];
        int max = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
            }
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        return new int[] {min, max};
    }
}
