import java.util.Scanner;

/*
10. Напишите программу, в которой Пользователь вводит два числа, а
программой вычисляется и отображается сумма и разность этих чисел.
 */
public class Task10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number:");
        int a = scanner.nextInt();
        System.out.println("Enter second number");
        int b = scanner.nextInt();
        scanner.close();
        System.out.printf("Sum is %d \nDiff is %d", a+b, Math.abs(a-b));
    }
}
