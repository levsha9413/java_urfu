package Task5;
/*
5. Напишите программу со статическим методом, которым вычисляется сумма
квадратов натуральных чисел
1^2 + 2^2 + 3^2 + ... + п^2
. Число п передается аргументом методу.
Предложите версию метода с рекурсией и без рекурсии. Для проверки результата можно
использовать формулу 1^2 + 2^2 +3^2+…+n^2 = (n+1) (2n + 1)/6
 */

public class Task5 {
    public static void main(String[] args) {
        System.out.println(MyClass.squareSum(4));
        System.out.println(MyClass.squareSumByRecursion(4));
    }
}
class MyClass{
    static double squareSum(int n){
        double rez = 0;
        for(double x=1;x<=n;++x){
            rez = rez + Math.pow(x,2);
        }
        return rez;
    }

    static double squareSumByRecursion(int n){
        double rez=0;
        if(n>1){
            rez = Math.pow(n,2) + squareSumByRecursion(n-1);
        }
        else
        {
            rez = Math.pow(n,2);
        }
        return rez;
    }
}