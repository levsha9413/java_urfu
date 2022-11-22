import java.util.Scanner;

/*
6. Напишите программу, в которой создается одномерный числовой
массив и заполняется числами, которые при делении на 5 дают в остатке 2
(числа 2, 7,12,17 и так далее). Размер массива вводится пользователем.
Предусмотреть обработку ошибки, связанной с вводом некорректного
значения.
 */
public class Task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the limit:");
        int limit = scanner.nextInt();
        scanner.close();
        if(limit<0){
            System.out.println("Error input date (limit < 0)");
            return;
        }
        int[] sequence = new int[limit];
        int number;
        int i;
        for(i=0,number=0; i<limit; ++number){
            if(number%5==2){
                sequence[i]=number;
                ++i;
            }
        }

    }
}
