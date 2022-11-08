import org.w3c.dom.ls.LSInput;

import java.util.Scanner;

/*
Напишите программу, в которой Пользователь вводит сначала фамилию,
        затем имя, затем отчество. После ввода программа выводит сообщение «Hello
<ФАМИЛИЯ, ИМЯ, ОТЧЕСТВО>»
*/
public class Task1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите фамилию");
        String secondName = in.nextLine();
        String name = in.nextLine();
        String surname = in.nextLine();
        in.close();
        System.out.println("Hello " + secondName + " " + name + " " + surname);

    }
}
