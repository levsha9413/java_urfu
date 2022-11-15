import java.util.Scanner;

/*
4.Напишите программу, в которой пользователю предлагается ввести
название месяца и количество дней в этом месяце. Программа выводит
сообщение о том, что соответствующий месяц содержит указанное количество
дней
 */
public class Task4 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter month:");
        String month = reader.nextLine();
        System.out.println("How days in this month?");
        int days = reader.nextInt();
        reader.close();

        System.out.printf("Month %s contains %d days", month, days);
    }
}
