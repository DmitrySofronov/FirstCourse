package lab6.Task1;

public class Task1 {
    private char ch;
    private String str;

    public void Symbol (char c) {
        ch = c;
        System.out.println("метод вызывается с символьным аргументом ch = "+ch);
    }
    //Если метод вызывается с текстовым аргументом, то он определяет значение текстового ноля.

    public void Text (String s) {
        str = s;
        System.out.println("метод вызывается с текстовым аргументом str = "+str);
    }
    //Если массив состоит из одного элемента, то он определяет значение символьного поля.
    public void SetField(char [] CharArray) {
        if (CharArray.length == 1){
            ch = CharArray[0];
            System.out.println("массив состоит из одного элемента: ch = "+ch);
        }
        else{
            //Если в массиве больше одного элемента) из символов массива формируется текстовая строка и присваивается значением текстовому полю.
            str=new String(CharArray);
            System.out.println("в массиве больше одного элемента: str = "+str);}
    }
}
