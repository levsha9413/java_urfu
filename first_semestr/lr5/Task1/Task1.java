package Task1;

/*
1. Напишите программу с классом, в котором есть закрытое символьное поле
и три открытых метода. Один из методов позволяет присвоить значение полю.
Еще один метод при вызове возвращает результатом код символа. Третий
метод позволяет вывести в консольное окно символ (значение поля) и его код.
 */
public class Task1 {
    public static void main(String[] args) {
        MyClass myClass = new MyClass();
        myClass.setMyChar('B');
        myClass.printMyChar();

    }
}

class MyClass{
    private char myChar;

    public void setMyChar(char myChar) {
        this.myChar = myChar;
    }

    public int getMyChar() {
        return myChar;
    }
    public void printMyChar(){
        System.out.println(myChar + ": " + getMyChar() );
    }
}
