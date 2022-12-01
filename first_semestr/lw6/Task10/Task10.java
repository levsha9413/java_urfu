package Task10;
/*
10. Напишите программу со статическим методом, аргументом которому передается
произвольное количество целочисленных аргументов. Результатом метод возвращает
массив из двух элементов: это значения наибольшего и наименьшего значений среди
аргументов, переданных методу
 */
public class Task10 {
    public static void main(String[] args) {
        int[] a = new int[2];
        int[] b = {12,23,34,4,5,6,7,8,1,99,33,34};
        a = MyClass.rangeMaxMin(12,23,34,4,5,6,7,8,1,99,33,34);
    }
}

class MyClass{
    static int[] rangeMaxMin(int ... numbers){
        int[] sort = new int[2];
        int[] a = new int[numbers.length];
        for(int i=0;i<numbers.length; ++i){
            for(int j=0; j<numbers.length; ++j){
                if(numbers[i]<numbers[j]){
                    int minor = numbers[i];
                    numbers[i]=numbers[j];
                    numbers[j]=minor;


                }
            }
        }
        sort[0]=numbers[0];
        sort[1]=numbers[numbers.length-1];
        return sort;
    }

}
