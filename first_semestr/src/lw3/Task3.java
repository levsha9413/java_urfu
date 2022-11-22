import java.util.Scanner;

/*
3. Напишите программу, которая выводит последовательность чисел
Фибоначчи. Первые два числа в этой последовательности равны 1, а каждое
следующее число равно сумме двух предыдущих (получается последовательность 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89 и
так далее). Количество чисел
в последовательности вводится пользователем. Предложите версии
программы, использующие разные операторы цикла.
 */
public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number in sequence:");
        int limiter = scanner.nextInt();
        scanner.close();
        int[] sequense =  new int[limiter];
        sequense[0] = sequense[1] = 1;
        for(int i=2; i<limiter; ++i){
            sequense[i] = sequense[i-1] + sequense[i-2];
        }
        for (int number:
             sequense) {
            System.out.println(number);
        }

    }
}
