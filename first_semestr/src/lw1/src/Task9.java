import java.util.Scanner;

/*
9. Напишите программу, в которой пользователь вводит число, а программой
отображается последовательность из четырех чисел: число, на единицу
меньше введённого, введенное число и число, на единицу больше введенного.
Четвертое число должно быть квадратом суммы первых трех чисел
 */
public class Task9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number:");
        int x = scanner.nextInt();
        scanner.close();
        double sum = (x-1)+x+(x+1);
        System.out.printf("%d, %d, %d, %.0f ", x-1, x, x+1, Math.pow(sum,2));

    }
}
