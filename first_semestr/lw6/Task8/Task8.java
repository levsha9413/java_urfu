package Task8;
/*
8. Напишите программу со статическим методом, аргументом которому передается
целочисленный массив, а результатом возвращается среднее значение для элементов
массива (сумма значений элементов, деленная на количество элементов в массиве).
 */
public class Task8 {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5,6};
        int[] b = {7,8,9};
        int[] c = {1,3,8};
        double x = MyClass.avg(a);
        double y = MyClass.avg(b);
        double z = MyClass.avg(c);
    }
}

class MyClass{
    static double avg(int[] numbers){
        double summ=0;
        for(int x: numbers){
            summ = summ + x;
        }
        return summ/ numbers.length;
    }
}
