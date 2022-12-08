package Task3;
/*
3. Напишите программу, в которой на основе суперкласса создается подкласс, а на
основе этого подкласса создается еще один подкласс (цепочка наследования из трех
классов). В первом суперклассе есть открытое целочисленное поле, метод с одним
параметром для присваивания значения полю и конструктор с одним параметром. Во
втором классе появляется открытое символьное поле, метод с двумя параметрами для
присваивания значения полям (перегрузка метода из суперкласса) и конструктор с двумя
параметрами. В третьем классе появляется открытое текстовое ноле, метод с тремя
аргументами для присваивания значений полям (перегрузка метода из суперкласса) и
конструктор с тремя параметрами. Для каждого класса определите метод toString () так,
чтобы он возвращал строку с названием класса и значениями всех полей объекта.
 */
public class Task3 {
    public static void main(String[] args) {
        Father a = new Father(5, 'g');
        System.out.println(a.toString());
        Sun b = new Sun(10, 'f', "test");
        System.out.println(b.toString());
    }
}

class GrandFather{
    public int Number;

    public void setFields(int number) {
        Number = number;
    }

    public GrandFather(int number) {
        this.setFields(number);
    }

    public String toString(){
        return this.getClass() + " " + this.Number;
    }
}

class Father extends GrandFather{
    public char symbol;

    public void setFields(int number, char x) {
        super.setFields(number);
        this.symbol = x;
    }

    public Father(int number, char symbol) {
        super(number);
        this.setFields(number, symbol);
    }

    public String getFields() {
        return super.Number + " " + this.symbol;
    }

    @Override
    public String toString(){
        return this.getClass() + " " + getFields();
    }

}

class Sun extends Father{
    public String text;

    public void setText(String text, char c, int num) {
        this.text = text;
        super.setFields(num, c);
    }

    public Sun(int number, char symbol, String text) {
        super(number, symbol);
        this.text = text;
    }

    @Override
    public String toString(){
        return this.getClass() + " " + super.getFields() + " " + this.text;
    }
}