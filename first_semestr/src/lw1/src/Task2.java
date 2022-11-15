import java.util.Scanner;

/*Напишите программу, в которой Пользователь вводит имя и возраст.
        Программа отображает сообщение об имени и возрасте пользователя.
*/
public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите свое имя:");
        String userName = scanner.nextLine();
        System.out.println("Введите ваш возраст:");
        int age = scanner.nextInt();
        scanner.close();
        System.out.printf("Данные о пользователе: \n" + "Имя: " + userName + "\nВозраст: " + age);
    }

}
