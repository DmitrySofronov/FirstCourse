package lab5.Task6;

public class Task6 {
    private int max;
    private int min;

    public void setInt(int num1, int num2) {
        System.out.println("Метод с двумя аргументами");
        min = Math.min(num1, num2);
        max = Math.max(num1, num2);
    }
    public void setInt1(int num){
        System.out.println("Метод с одним аргументом");
        min = Math.min(min, num);
        max = Math.max(max, num);
    }
    void PrintInt() {
        System.out.println("min = "+min);
        System.out.println("max = "+max);
    }

    Task6(int num1, int num2){
        System.out.println("Конструктор c двумя аргументами");
        min = Math.min(num1, num2);
        max = Math.max(num1, num2);
    }

    Task6(int num){
        System.out.println("Конструктор c одним аргументом");
        min = Math.min(min, num);
        max = Math.max(max, num);
    }

}
