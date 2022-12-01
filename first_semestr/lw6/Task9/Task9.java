package Task9;
/*
9. Напишите программу со статическим методом, аргументом которому передается
одномерный символьный массив. В результате вызова метода элементы массива попарно
меняются местами: первый — с последн и м , второй — с предпоследним и так далее.
 */
public class Task9 {
    public static void main(String[] args) {
        char[] chars = {'a','b','c','A','B','C'};
        MyClass.rotate(chars);
        System.out.println(chars);
    }
}

class MyClass{
    static void rotate(char[] charsArray){
        char[] subArray = new char[charsArray.length];
        int i;
        int j;
        for(i = charsArray.length-1, j=0; i>=0; --i, ++j){
            subArray[j]=charsArray[i];
        }
        for(i = charsArray.length-1, j=0; i>=0; --i, ++j){
            charsArray[i]=subArray[i];
        }
    }
}
