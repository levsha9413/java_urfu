package Task6;
/*
6. Напишите программу с классом, в котором есть два закрытых
целочисленных поля (назовем их max и min). Значение поля max не может
быть меньше значения поля min. Значения полям присваиваются с помощью
открытого метода. Метод может вызываться с одним или двумя
целочисленными аргументами. При вызове метода значения полям
присваиваются так: сравниваются текущие значения полей и значения
аргументов, переданных методу. Самое большое из значений присваивается
полю max, а самое маленькое из значений присваивается полю min.
Предусмотрите конструктор, который работает по тому же принципу, что и
метод для присваивания значений полям. В классе также должен быть метод,
отображающий в консольном окне значения полей объекта.
 */

public class Task6 {
    public static void main(String[] args) {
        MyClass a = new MyClass(44);
        a.printer();
        a.setFields(50);
        a.printer();
        a.setFields(12,-15);
        a.printer();

    }
}
class MyClass{
    private int min;
    private int max;

    public void setFields(int number) {
        if(number>this.max){
            this.max=number;
        }else if(number<this.min){
            this.min = number;
        }
    }

    public void setFields(int a, int b){
        if(a>this.max){
            this.max=a;
        }
        if (b>this.max) {
            this.max = b;
        }
        if (a<this.min) {
            this.min=a;
        }
        if (b<this.min) {
            this.min = b;
        }
    }
    public MyClass(int a, int b) {
        this.setFields(a, b);
    }

    public MyClass(int number) {
        this.setFields(number);
    }

    public int getMin() {
        return min;
    }

    public int getMax() {
        return max;
    }

    public void printer(){
        System.out.println("Max: " + getMax() + "\nMin: " + getMin());
    }
}