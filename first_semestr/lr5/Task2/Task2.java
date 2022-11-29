package Task2;

/*
2. Напишите программу с классом, у которого есть два символьных поля и
метод. Он возвращает результат, и у него нет аргументов. При вызове метод
выводит в консольное окно все символы из кодовой таблицы, которые
находятся «между» символами, являющимися значениями полей объекта (из
которого вызывается метод). Например, если полям объекта присвоены
значения ‘A’ и ‘D’, то при вызове метода в консольное окно должны
выводиться все символы от ‘A’ до ‘D’ включительно.
 */
public class Task2 {
    public static void main(String[] args) {
    MyClassForTask2 printer = new MyClassForTask2('A','D');
    printer.printCharRange();
    }
}
class MyClassForTask2{
    private char first;
    private char last;

    public MyClassForTask2(char first, char last) {
        this.first = first;
        this.last = last;
    }

    public void printCharRange(){
        for(int i = first; i<=last; ++i){
            System.out.println((char) i);
        }
    }
}
