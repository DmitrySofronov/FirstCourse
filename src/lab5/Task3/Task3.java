package lab5.Task3;

public class Task3 {

    private int x;
    private int y;

    Task3 () {
        System.out.println("\nКонструктор , позволяющий создавать объекты без передачи аргументов \n");
        this.x = 0;
        this.y = 0;
    }

    Task3 (int x) {
        System.out.println("Конструктор, позволяющий создавать объекты с передачей одного аргумента");
        this.x = x;
        System.out.println("x в степени x: " +exp(x)+ "\n");
    }
    public int exp (int x){
        this.x = x;
        int result = 1;
        for (int i = 1; i<= x; i++) {
            result = x * result;
        }
        return result;
    }

    Task3 (int x, int y) {
        System.out.println("Конструктор, позволяющий создавать объекты с передачей двух аргументов");
        this.x = x;
        this.y = y;
        System.out.println("x в степени y: " +exp2(x,y)+ "\n");
    }
    public int exp2 (int x2, int y2) {
        x2 = x;
        y2 = y;
        int result = 1;
        for (int i = 1; i <= y; i++){
            result = x * result;
        }
        return result;
    }
}

