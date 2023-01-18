package lab6.Task7;

public class Task7 {

    public static int[] getIntArray(char[] charArray) {
        int[] intArray = new int[charArray.length];
        for (int i = 0; i < charArray.length; i++) {
            intArray[i] = (int) charArray[i];
        }
        return intArray;
    }
}
