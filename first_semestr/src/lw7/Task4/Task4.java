package Task4;
/*
4. Напишите программу, в которой использована цепочка наследования из трех
классов. В первом классе есть открытое символьное поле. Во втором классе появляется
открытое текстовое поле. В третьем классе появляется открытое целочисленное поле. В
каждом из классов должен быть конструктор, позволяющий создавать объект на основе
значений полей, переданных аргументами конструктору, а также конструктор создания
копии.
 */
public class Task4 {
    public static void main(String[] args) {
        Sun a = new Sun('x',"text",12);
        Sun b = new Sun(a);
    }
}

class GranFather{
    public char c;

    public GranFather(char c) {
        this.c = c;
    }

    public GranFather(GranFather ded) {
        this(ded.c);
    }
}
class Father extends GranFather{
    public String text;

    public Father(char c, String text) {
        super(c);
        this.text = text;
    }

    public Father(Father batya) {
        this(batya.c, batya.text);

    }
}
class Sun extends Father{
    public int number;

    public Sun(char c, String text, int number) {
        super(c, text);
        this.number = number;
    }

    public Sun(Sun maloy) {
        this(maloy.c, maloy.text, maloy.number);
    }
}