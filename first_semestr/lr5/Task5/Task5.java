package Task5;


/*
5. Напишите программу с классом, у которого есть закрытое целочисленное
поле. Значение полю присваивается с помощью открытого метода. Методу
аргументом может передаваться целое число, а также метод может вызываться
без аргументов. Если методы вызывается без аргументов, то поле получает
нулевое значение. Если метод вызывается с целочисленным аргументом, то
это значение присваивается полю. Однако если переданное аргументом
методу значение превышает 100, то значением полю присваивается число 100.
Предусмотрите в классе конструктор, который работает по тому же принципу
что и метод для присваивания значения полю. Также в классе должен быть
метод, позволяющий проверить значение поля.
 */
public class Task5 {
    public static void main(String[] args) {
        MyClass a = new MyClass();
        MyClass b = new MyClass(100);
        MyClass c = new MyClass(50);
        MyClass d = new MyClass(101);
        System.out.println(a.getField());
        System.out.println(b.getField());
        System.out.println(c.getField());
        System.out.println(d.getField());
    }
}

class MyClass{
    private int field;

    public void setField(int field) {
        this.field = field>100 ? 100 : field;
    }

    public void setField(){
        this.field = 0;
    }

    public int getField() {
        return field;
    }

    public MyClass(int field) {
        setField(field);
    }
    public MyClass(){
        setField();
    }

}
