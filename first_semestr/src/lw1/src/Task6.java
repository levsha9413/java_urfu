import java.util.Scanner;

/*
6. Напишите программу, в которой Пользователь вводит имя и год рождения,
в программа отображает сообщение содержащее имя пользователя и его
возраст.
 */
public class Task6 {
    public static void main(String[] args) {
        final int CURRENT_YEAR = 2022;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter name:");
        String userName = scanner.nextLine();
        System.out.println("Enter year of your birth");
        int birthYear = scanner.nextInt();
        scanner.close();
        System.out.printf("Yor name is %s and you %d years old", userName, (CURRENT_YEAR-birthYear));

    }
}
