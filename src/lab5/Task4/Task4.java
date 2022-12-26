package lab5.Task4;

public class Task4 {
    private char ch;
    private int x;

    Task4 (char ch, int x) {
        System.out.println("Версия конструктора с двумя аргументами");
        this.ch = ch;
        this.x = x;

        System.out.println("ch = " +ch+  ", int = " +x+ "\n");
    }
    Task4 (double value) {
        System.out.println("Версия конструктора с одним аргументом типа double");
        char ch1 = (char) value;

        x = (int) ((value - (int) value) * 100);
        System.out.println("ch = " + ch1 + "; int = " + x + "\n");
    }

}

