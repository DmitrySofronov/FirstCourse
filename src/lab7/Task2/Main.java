package lab7.Task2;

public class Main {
    public static void main(String[] args) {
        SuperClassTask2 superClassObject = new SuperClassTask2();
        String superClassTest0 = superClassObject.toString();
        System.out.println(superClassTest0);

        SuperClassTask2 myTest1 = new SuperClassTask2("test this");
        String superClassTest1 = myTest1.toString();
        System.out.println(superClassTest1);

        SuperClassTask2 myTest2 = new SubClassTask2();
        String subClassTest0 = myTest2.toString();
        System.out.println(subClassTest0);

        SuperClassTask2 myTest3 = new SubClassTask2("test this too");
        String subClassTest1 = myTest3.toString();
        System.out.println(subClassTest1);

        SuperClassTask2 myTest4 = new SubClassTask2(256);
        String subClassTest2 = myTest4.toString();
        System.out.println(subClassTest2);

        SuperClassTask2 myTest5 = new SubClassTask2("test this and this", 256);
        String subClassTest3 = myTest5.toString();
        System.out.println(subClassTest3);
    }
}

/*
Напишите программу, в которой есть суперкласс с приватным текстовым полем.
1.В базовом классе должен быть метод для присваивания значения полю:
без параметров и с одним текстовым параметром.
2.Объект суперкласса создается передачей одного текстового аргумента
конструктору. Доступное только для чтения свойство результатом возвращает
длину текстовой строки.

3.На основе суперкласса создается подкласс. В подклассе появляется
дополнительное открытое целочисленное поле.
4.В классе должны быть такие версии метода для присваивания значений полям
(используется переопределение и перегрузка метода из суперкласса):
без параметров, с текстовым параметром, с целочисленным параметром,
с текстовым и целочисленным параметром.
5.У конструктора подкласса два параметра (целочисленный и текстовый).
 */