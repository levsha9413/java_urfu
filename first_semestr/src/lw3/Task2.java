import java.util.Scanner;

/*
2. Напишите программу, в которой пользователю предлагается
ввести название дня недели. По введенному названию программа определяет
порядковый номер дня в неделе. Если пользователь вводит неправильное
название дня, программа выводит сообщение о том, что такого дня нет.
Предложите версию программы на основе вложенных условных операторов и
на основе оператора выбора switch.
 */
public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the day:");
        String day = scanner.nextLine();
        scanner.close();
        if(day.equals("Понедельник")|day.equals("Вторник")|day.equals("Среда")|day.equals("Четверг")
                |day.equals("Пятница")|day.equals("Суббота")|day.equals("Воскресенье")) {
            if (day.equals("Понедельник")) System.out.println("1");
            else if (day.equals("Вторник")) System.out.println("2");
            else if (day.equals("Среда")) System.out.println("3");
            else if (day.equals("Четверг")) System.out.println("4");
            else if (day.equals("Пятница")) System.out.println("5");
            else if (day.equals("Суббота")) System.out.println("6");
            else if (day.equals("Воскресенье")) System.out.println("7");
        }else{
            switch (day) {
                case "Monday":
                    System.out.println(1);
                    break;
                case "Tuesday":
                    System.out.println(2);
                    break;
                case "Wednesday":
                    System.out.println(3);
                    break;
                case "Thursday":
                    System.out.println(4);
                    break;
                case "Friday":
                    System.out.println(5);
                    break;
                case "Saturday":
                    System.out.println(6);
                    break;
                case "Sunday":
                    System.out.println(7);
                    break;
                default:
                    System.out.println("Error input data");
            }
        }
    }
}
