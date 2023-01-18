package lab7.Task2;

public class SuperClassTask2 {
    //приватное текстовое поле
    private String str1;

    SuperClassTask2() {
        setStr1();
    }
    //передача одного текстового аргумента конструктору.

    SuperClassTask2 (String str1){
        setStr1(str1);
    }
    //метод для присваивания значения полю без параметров
    public void setStr1 (){
        this.str1 = "поле суперкласса без параметров";
    }
    //метод для присваивания значения полю с одним текстовым параметром
    public void setStr1 (String str1){
        this.str1 = str1;
    }

    public String getStr1(){
        //   System.out.println(str1);
        return str1;
    }
    //Доступное только для чтения свойство результатом возвращает длину текстовой строки.
    public int getStr1length(){
        //   System.out.println("Длина текстовой строки="+str1.length());
        return str1.length();
    }


    @Override
    public String toString() {
        String superClassNameAndFieldValue = "SuperClassTask2{" + "str1=\"" + getStr1() + '\"' + " string.length = " +"\""+getStr1length()+"\"}";
        return superClassNameAndFieldValue;
    }
}

