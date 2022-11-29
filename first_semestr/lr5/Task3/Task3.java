package Task3;
/*
3. Напишите программу с классом, у которого есть два целочисленных поля.
В классе должны быть описаны конструкторы, позволяющие создавать
объекты без передачи аргументов, с передачей одного аргумента и с передачей
двух аргументов.
 */

import java.util.Random;

public class Task3 {
    public static void main(String[] args) {
        MyClass a = new MyClass();
        MyClass b = new MyClass(2);
        MyClass c = new MyClass(3, 6);

    }
}

class MyClass{
    private int a;
    private int b;

    public MyClass(int a) {
        this.a = a;
        this.b = a;
    }

    public MyClass(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public MyClass() {
        Random random = new Random();
        a = random.nextInt(100);
        b = random.nextInt(100);
    }
}
