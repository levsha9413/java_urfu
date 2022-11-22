import java.util.Scanner;

/*
4. Напишите программу, в которой пользователем вводится два
целых числа. Программа выводит все целые числа — начиная с наименьшего
(из двух введенных чисел) и заканчивая наибольшим (из двух введенных
чисел). Предложите разные версии программы (с использованием разных
операторов цикла).
 */
public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the lower limit:");
        int lowerLimiter = scanner.nextInt();
        System.out.println("Enter the upper limit:");
        int upperLimiter =scanner.nextInt();
        scanner.close();

        if (lowerLimiter<10) {
            for (; lowerLimiter <= upperLimiter; ++lowerLimiter) {
                System.out.println(lowerLimiter);
            }
        }else {
            while (lowerLimiter <= upperLimiter) {
                System.out.println(lowerLimiter);
                ++lowerLimiter;
            }
        }
    }
}
