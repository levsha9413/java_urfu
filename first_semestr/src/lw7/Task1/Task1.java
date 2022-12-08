package Task1;
/*
1. Напишите программу, в которой есть суперкласс с приватным текстовым полем,
конструктором с текстовым параметром и где переопределен метод toString (). На основе
суперкласса путем наследования создается подкласс. У него появляется еще одно
приватное текстовое ноле. Также подкласс должен иметь версии конструктора с одним и
двумя текстовыми аргументами, а еще в нем должен быть переопределен метод toString ().
В обоих классах метод toString () переопределяется так, что он возвращает строку с
названием класса и значение текстового поля или текстовых полей
 */

public class Task1 {
    public static void main(String[] args) {
        MyClass a = new MyClass("Super class");
        System.out.println(a.toString());
        MySubclass b = new MySubclass("Sub class");
        System.out.println(b.toString());

    }
}

class MyClass{
    private String textField;

    public MyClass(String textField) {
        this.textField = textField;
    }

    public String getTextField() {
        return textField;
    }

    @Override
    public String toString(){
        return this.getClass() + " " + this.textField;
    }
}

class MySubclass extends MyClass{
    private String subField;

    public MySubclass(String textField, String subField) {
        super(textField);
        this.subField = subField;
    }

    public MySubclass(String subField) {
        super(subField);
        this.subField = subField;
    }
    @Override
    public String toString(){
        return this.getClass() + " " + super.getTextField() + " " + this.subField;
    }
}