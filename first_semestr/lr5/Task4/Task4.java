package Task4;
/*
4. Напишите программу с классом, у которого есть символьное и
целочисленное поле. В классе должны быть описаны версии конструктора с
двумя аргументами (целое число и символ – определяют значения полей), а
также с одним аргументом типа double. В последнем случае действительная
часть аргумента определяет код символа (значение символьного поля), а
дробная часть (с учетом десятых и сотых) определяет значение
целочисленного поля. Например, если аргументом передается число 65.1267,
то значением символьного поля будет символ ‘A’ с годом 65, а целочисленное
поле получит значение 12 (в дробной части учитываются только десятые и
сотые).
 */
public class Task4 {
    public static void main(String[] args) {
        MyClass a = new MyClass(5, 'F');
        MyClass b = new MyClass(12.3);
        MyClass c = new MyClass(65.247);

    }
}

class MyClass{
    private int digitField;
    private char charField;

    public MyClass(int digitField, char chatField) {
        this.digitField = digitField;
        this.charField = chatField;
    }

    public MyClass(double number) {
        int code = (int) number;
        this.charField = (char) code;
        this.digitField = (int)((int)(number%1*100)%10==0 ? number%1*10 : number%1*100);





    }
}
