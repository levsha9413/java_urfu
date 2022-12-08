package Task2;
/*
2. Напишите программу, в которой есть суперкласс с приватным текстовым полем. В
базовом классе должен быть метод для присваивания значения полю: без параметров и с
одним текстовым параметром. Объект суперкласса создается передачей одного текстового
аргумента конструктору. Доступное только для чтения свойство результатом возвращает
длину текстовой строки. На основе суперкласса создается подкласс. В подклассе появляется
дополнительное открытое целочисленное поле. В классе должны быть такие версии метода
для присваивания значений полям (используется переопределение и перегрузка метода из
суперкласса): без параметров, с текстовым параметром, с целочисленным параметром, с
текстовым и целочисленным параметром. У конструктора подкласса два параметра
(целочисленный и текстовый).
 */
public class Task2 {
    public static void main(String[] args) {
        MySuperClass a = new MySuperClass("text");
        MySubClass b = new MySubClass("text", 5);
        b.setStringField(10);
        b.setStringField(19, "drop");
        b.setStringField("test");
        b.setStringField();

    }
}

class MySuperClass{
    private String stringField;

    public void setStringField(String stringField) {
        this.stringField = stringField;
    }

    public void setStringField() {
        this.stringField = "default";
    }

    public MySuperClass(String stringField) {
        this.stringField = stringField;
    }
}

class MySubClass extends MySuperClass{
    public int lenth;

    public MySubClass(String stringField, int lenth) {
        super(stringField);
        this.lenth = lenth;
    }

    public void setLenth(int lenth) {
        this.lenth = lenth;
    }
    @Override
    public void setStringField() {
        this.lenth = 0;
        super.setStringField();
    }

    public void setStringField(int x) {
        this.lenth = x;

    }
    public void setStringField(String text) {
        super.setStringField(text);
    }


    public void setStringField(int x, String text) {
        this.lenth = x;
        super.setStringField(text);
    }
}
