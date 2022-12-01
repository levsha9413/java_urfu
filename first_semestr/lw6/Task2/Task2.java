package Task2;
/*
2. Напишите программу с классом, в котором есть закрытое статическое
целочисленное ноле с начальным нулевым значением. В классе должен быть описан
статический метод, при вызове которого отображается текущее значение статического
поля, после чего значение поля увеличивается на единицу.
 */

public class Task2 {
    public static void main(String[] args) {
        MyClass.printerAndIncrementerForDigitField();
        MyClass.printerAndIncrementerForDigitField();
        MyClass.printerAndIncrementerForDigitField();
        MyClass.printerAndIncrementerForDigitField();
        MyClass.printerAndIncrementerForDigitField();


    }
}

class MyClass{
    private static int digitField = 0;

    public static void printerAndIncrementerForDigitField(){
        System.out.println(digitField++);
    }
}
