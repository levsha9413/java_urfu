import java.util.Scanner;

/*
5. Напишите программу, в которой вычисляется сумма чисел,
удовлетворяющих таким критериям: при делении числа на 5 в остатке получается 2,
или при делении на 3 в остатке получается 1. Количество чисел в сумме
вводится пользователем. Программа отображает числа, которые
суммируются, и значение суммы. Предложите версии программы,
использующие разные операторы цикла
 */
public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter limit:");
        int limiter = scanner.nextInt();
        scanner.close();
        int i;
        int number;
        int[] summ = new int[limiter];
        for(i = 0,  number = 0; i<limiter; ++number ){
            if(number%5==2 | number%3==1){
                summ[i]=number;
                System.out.println(summ[i]);
                ++i;
            }
        }
        int z=0;
        while(limiter>0){
            --limiter;
            z = z + summ[limiter];

        }
        System.out.println("Summ = " + z);

    }
}
