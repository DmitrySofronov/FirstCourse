package lab5.Task5;

public class Task5 {
    private int value;
    public void Set(int n) {
        System.out.print("Метод c аргументом");
        value = n;
        if (n >= 100) {
            value = 100;
        }
    }
    public void Set() {
        System.out.print("Метод без аргумента: ");
        value = 0;
    }
    public int PrintInt() {
        return value; //проверка значения
    }
    Task5(int value) {
        System.out.println("Конструктор: value = " + value +"\n");
        this.Set(value);
    }
}

