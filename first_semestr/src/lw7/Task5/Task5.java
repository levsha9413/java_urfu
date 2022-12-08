package Task5;

import javax.xml.stream.FactoryConfigurationError;

/*
5. Напишите программу, в которой есть суперкласс с защищенным текстовым полем,
конструктор с текстовым параметром и метод, при вызове которого в консольном окне
отображается название класса и значение поля. На основе суперкласса создаются два
подкласса (оба на основе одного и того же суперкласса). В одном из классов появляется
защищенное целочисленное поле, там есть конструктор с двумя параметрами и
переопределен метод для отображения значений полей объекта и названия класса. Во
втором подклассе появляется защищенное символьное поле, конструктор с двумя
параметрами и переопределен метод, отображающий в консоли название класса и значения
полей. В главном методе создайте объекты каждого из классов. Проверьте работу метода,
отображающего значения полей объектов, для каждого из объектов. Вызовите этот же
метод через объектную переменную суперкласса, которая ссылается на объект
производного класса.
 */
public class Task5 {
    public static void main(String[] args) {
        Father batya = new Father("Smith");
        FirstSun petya = new FirstSun("Smith", 10);
        SecondSun vasya = new SecondSun("Smith",'v');
        batya.print();
        petya.print();
        vasya.print();
        Father psevdobatya = petya;
        psevdobatya.print();
        FirstSun psevdopetya = (FirstSun) batya;
        psevdopetya.print();

    }
}
class Father{
    private String textField;

    public Father(String textField) {
        this.textField = textField;
    }

    public String getTextField() {
        return textField;
    }

    public void print(){
        System.out.println(this.getClass() +" "+ this.getTextField());
    }
}
class FirstSun extends Father{
    private int number;

    public FirstSun(String text, int number) {
        super(text);
        this.number = number;
    }

    public int getNumber() {
        return number;
    }
    @Override
    public void print(){
        System.out.println(this.getClass() +" "+ super.getTextField()+" "+this.getNumber());
    }

}
class SecondSun extends Father{
    private char charField;

    public char getCharField() {
        return charField;
    }

    public SecondSun(String textField, char c) {
        super(textField);
        this.charField = c;
    }

    @Override
    public void print(){
        System.out.println(this.getClass() +" "+ super.getTextField()+" "+this.getCharField());
    }
}
