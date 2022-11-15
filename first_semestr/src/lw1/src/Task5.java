import java.util.Scanner;

/*
5. Напишите программу, в которой по году рождения определяется возраст
пользователя.
 */
public class Task5 {
    public static void main(String[] args) {
        final int CURRENT_YEAR = 2022;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter year of your birth:");
        int birthYear = scanner.nextInt();
        scanner.close();
        System.out.println("You are " + (CURRENT_YEAR - birthYear));


    }
}
