package lab6.Task1;

public class Main {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Task1 task1 = new Task1();
        task1.Symbol('A');
        task1.Text("Boom");
        char[] CharArray1 = {'с','т','р','о','к','а'};
        char[] CharArray2 = {'C'};
        task1.SetField(CharArray1);
        task1.SetField(CharArray2);

    }
}


/*Напишите программу с классом, в котором есть два
поля: символьное и текстовое. В классе должен быть
перегруженный метод для присваивания значений полям.
-Если метод вызывается с символьным аргументом,
то соответствующее значение присваивается символьному
полю.
-Если метод вызывается с текстовым аргументом,
то он определяет значение текстового ноля. Методу
аргументом также может передаваться символьный
массив.
-Если массив состоит из одного элемента,
то он определяет значение символьного поля.
В противном случае (если в массиве больше одного
элемента) из символов массива формируется текстовая
строка и присваивается значением текстовому полю.

 */