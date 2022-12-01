package Task6;
/*
6. Напишите программу со статическим методом, которому аргументом передается
целочисленный массив и целое число. Результатом метод возвращает ссылку на новый
массив, который получается из исходного массива (переданного первым аргументом
методу), если в нем взять несколько начальных элементов. Количество элементов, которые
нужно взять из исходного массива, определяются вторым аргументом метода. Если второй
аргумент метода больше длины массива, переданного первым аргументом, то методом
создается копия исходного массива и возвращается ссылка на эту копию.
 */
public class Task6 {
    public static void main(String[] args) {
        int[] a = {1, 2, 3};
        int[] b = MyClass.Copy(a,2);
        int[] c = MyClass.Copy(a,3);
        int[] d = MyClass.Copy(a, 4);
        int[] copyLink = a;
    }
}

class MyClass{
    static int[] Copy(int[] originalArray, int n){
        if(n<=originalArray.length) {
            int[] copyArray = new int[n];
            for(int i=0; i< copyArray.length; ++i){
                copyArray[i]=originalArray[i];
            }
            return copyArray;
        }else{
            int[] copyArray = originalArray.clone();
            return copyArray;
        }

    }
}
