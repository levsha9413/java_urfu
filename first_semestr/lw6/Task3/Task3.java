package Task3;
/*
3. Напишите программу с классом, в котором есть статические методы, которым
можно передавать произвольное количество целочисленных аргументов (или
целочисленный массив). Методы, на основании переданных аргументов или массива,
позволяют вычислить: наибольшее значение, наименьшее значение, а также среднее
значение из набора чисел.
 */
public class Task3 {
    public static void main(String[] args) {
        System.out.println(MyClass.avrg(7,7,7,3));
        System.out.println(MyClass.avrg(4,2,6));
        System.out.println(MyClass.max(17,22,1,56,99));
        System.out.println(MyClass.min(23,0,22,28,76,51));


    }
}

class MyClass{
    static int max(int ... x){
       int[] y = sort(x);
       return y[0];
    }

    static int min(int ... x){
        int[] y = sort(x);
        return y[y.length-1];
    }

    static double avrg(int ... x){
        int i=0;
        int rez=0;
        for (int y:x){
            rez += y;
            ++i;
        }
        return rez/i;
    }

    static int[] sort(int[] intArray){
        int[] sortedArray = new int[intArray.length];
        for(int i=0; i<intArray.length; ++i){
            for(int j=i+1; j<intArray.length; ++j) {
                if (intArray[i] < intArray[j]){
                    sortedArray[i]=intArray[j];
                }
            }
        }
        return sortedArray;
    }
}