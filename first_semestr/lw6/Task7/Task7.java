package Task7;
/*
7. Напишите программу со статическим методом, аргументом которому передастся
символьный массив, а результатом возвращается ссылка на целочисленным массив,
состоящий из кодов символов из массива- аргумента.
 */

public class Task7 {
    public static void main(String[] args) {
        char[] chars = {'a','b','c','A','B','C'};
        int[] rez = MyClass.transformer(chars);
    }
}

class MyClass{
    static int[] transformer(char[] symbolsArray){
        int[] numbers = new int[symbolsArray.length];
        for(int i=0; i< symbolsArray.length; ++i){
            numbers[i]=(int)symbolsArray[i];
        }
        return numbers;
    }
}