import java.util.Scanner;

/*
7. Напишите программу, в которой по возрасту определяется год рождения.
 */
public class Task7 {
    public static void main(String[] args) {
        final int CURRENT_YEAR = 2022;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your age:");
        int userAge = scanner.nextInt();
        scanner.close();
        System.out.println("You were born in " + (CURRENT_YEAR - userAge));
    }
}
