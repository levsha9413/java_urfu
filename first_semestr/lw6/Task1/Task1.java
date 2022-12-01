package Task1;
/*
1. Напишите программу с классом, в котором есть два ноля: символьное и текстовое.
В классе должен быть перегруженный метод для присваивания значений нолям. Если метод
вызывается с символьным аргументом, то соответствующее значение присваивается
символьному полю. Если метод вызывается с текстовым аргументом, то он определяет
значение текстового ноля. Методу аргументом также может передаваться символьный
массив. Если массив состоит из одного элемента, то он определяет значение символьного
поля. В противном случае (если в массиве больше одного элемента) из символов массива
формируется текстовая строка и присваивается значением текстовому полю.
 */
public class Task1 {
    public static void main(String[] args) {
        myClass a = new myClass();
        a.setFields('A');
        a.printer();
        a.setFields("Alohamora");
        a.printer();
        char[] x = {'a','b','c'};
        a.setFields(x);
        a.printer();
        char[] y = {'x'};
        a.setFields(y);
        a.printer();


    }
}

class myClass{
    char charField;
    String textField;

    public void setFields(char charField) {
        this.charField = charField;
    }

    public void setFields(String textField) {
        this.textField = textField;
    }

    public void setFields(char[] charArray){
        if(charArray.length>1){
            this.textField = new String(charArray);
        }else if(charArray.length==1){
            this.charField=charArray[0];
        }
    }

    public void printer(){
        System.out.println("Char field: " + this.charField);
        System.out.println("Text field: " + this.textField + "\n\n");
    }
}