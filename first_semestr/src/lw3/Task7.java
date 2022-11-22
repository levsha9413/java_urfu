import java.util.Scanner;

/*
7. Напишите программу, в которой создается одномерный
символьный массив из 10 элементов. Массив заполняется буквами «через
одну», начиная с буквы ' а ': то есть массив заполняется буквами ' а ' , ' с ' , ' е ' ,
' д ' и так далее. Отобразите массив в консольном окне в прямом и обратном
порядке. Размер массива задается переменной.
 */
public class Task7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the limit");
        int limit = scanner.nextInt();
        scanner.close();
        char[] alfabet = new char[limit]; //96-121
        int b=97;
        for(int i=0; i<limit; ++i){
            alfabet[i]=(char)b;
            b = b + 2;
        }
        for (char x: alfabet) {
            System.out.println(x);

        }
        for(--limit;limit>=0;--limit ){
            System.out.println(alfabet[limit]);
        }
    }
}
