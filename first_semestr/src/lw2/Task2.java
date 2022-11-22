package lw2;

import javax.security.auth.login.AccountLockedException;
import java.util.Scanner;

/*
2. Напишите программу, которая проверяет, удовлетворяет ли введенное
пользователем число следующим критериям: при делении на 5 в остатке
получается 2, а при делении на 7 в остатке получается 1.
 */
public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number:");
        int x = scanner.nextInt();
        scanner.close();

        if (x % 5 == 2 && x % 7 == 1) {
            System.out.printf("Number %d is satisfies the condition\n", x);
        } else {
            System.out.printf("Number %d doesn't satisfies the condition\n", x);
        }

    }
}
