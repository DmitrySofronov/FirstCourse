package lab7.Task1;

public class SuperClassTest {
    private String str1;
    //закрытое текстовое поле
    SuperClassTest (String strEx){
        this.str1 = strEx;
    }
    //конструктор с текстовым аргументом
    SuperClassTest(){
    }
    /*
    @Override - аннотация указываемая для того, чтобы показать,
    что далее мы собираемся переопределять метод суперкласса
     */
    @Override
    public String toString (){
        String superClassNameAndFieldValue;
        superClassNameAndFieldValue = "super" + "\n" +
                "Class name: " + this.getClass().getSimpleName() + "\n" +
                "str 1 = " + this.getStr1();

        return superClassNameAndFieldValue;
    }

    public String getStr1(){
        return str1;
    }

    public void setStr1(String str1) {
        this.str1 = str1;
    }
}
