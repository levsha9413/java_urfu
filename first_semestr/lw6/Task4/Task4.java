package Task4;
/*
4. Напишите программу, в которой описан статический метод для вычисления
двойного факториала числа, переданного аргументом методу. По определению, двойной
факториал числа п (обозначается как n!!) — это произведение через одно всех чисел, не
больших числа п. То есть n!! = п * (n - 2) * (п - 4)* ... (последний множитель равен 1 для
нечетного n и равен 2 для четного n). Например, 6!! = 6 х 4 х 2 = 48 и 5!! = 5 х 3 х 1 = 15.
Предложите версию метода без рекурсии и с рекурсией.
 */
public class Task4 {
    public static void main(String[] args) {
        System.out.println(MyClass.factorial(6));
        System.out.println(MyClass.factorial(5));
        System.out.println(MyClass.factorialByRecursive(6));
        System.out.println(MyClass.factorialByRecursive(5));
    }
}

class   MyClass{
    static int factorial(int x){
        boolean xIsEven = x%2==0;
        int rez = x;
        if(xIsEven){
            for(x=x-2;x>=2;x=x-2){
                rez=rez*x;
            }
        }else{
            for(x=x-2;x>=1;x=x-2){
                rez=rez*x;
            }
        }
        return rez;
    }

    static int factorialByRecursive(int x){
        boolean xIsEven = x%2==0;
        if(xIsEven){
            if(x>2){
                return x = x * (factorialByRecursive(x-2));
            }else{
                return x;
            }
        }else{
            if(x>1){
                return x = x * (factorialByRecursive(x-2));
            }else{
                return x;
            }
        }

    }
}
