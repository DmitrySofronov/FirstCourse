package lab7.Task1;

public class Main {
    public static void main(String[] args) {
        SuperClassTest superClassObject =
                new SuperClassTest("Переделал в конструктор суперкласса");
        String className = superClassObject.toString();
        System.out.println(className);

        SubClassTest subClassObject1 =
                new SubClassTest("переделал в конструктор подкласса");
        String subClassName1 = subClassObject1.toString();
        System.out.println(subClassName1);

        SubClassTest subClassObject2 =
                new SubClassTest("переделал в конструктор класса", "где два параметра");
        String subClassName2 = subClassObject2.toString();
        System.out.println(subClassName2);

    }
}

/*
Напишите программу, в которой есть суперкласс с приватным текстовым
полем, конструктором с текстовым параметром и где переопределен метод
toString (). На основе суперкласса путем наследования создается подкласс.
У него появляется еще одно приватное текстовое ноле. Также подкласс
должен иметь версии конструктора с одним и двумя текстовыми аргументами,
а еще в нем должен быть переопределен метод toString (). В обоих классах
метод toString () переопределяется так, что он возвращает строку с
названием класса и значение текстового поля или текстовых полей
 */