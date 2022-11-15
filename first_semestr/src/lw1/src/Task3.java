import java.util.Scanner;

/*
3. Напишите программу, в которой Пользователь последовательно вводит
название текущего дня недели, название месяца и дату (номер дня в месяце).
Программа выводит сообщение о сегодняшней дате (день недели, дата, месяц).

 */
public class Task3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter day:");
        String day =  input.nextLine();
        System.out.println("Enter month:");
        String month = input.nextLine();
        System.out.println("Enter date (only day):");
        int date = input.nextInt();
        input.close();

        System.out.println("The current date: \n"+ day + " " + date + " " + month );

    }


}
