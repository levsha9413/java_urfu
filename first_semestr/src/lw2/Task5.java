package lw2;

import java.util.Scanner;

/*
5. Напишите программу, которая проверяет, сколько тысяч во введенном
пользователем числе (определяется четвертая цифра справа в десятичном
представлении числа).
 */
public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number");
        int x = scanner.nextInt();
        scanner.close();
        int y = (int)(x/1000); //если по заданию нужно вывести тысячи
        int z = y%10;          //если по заданию нужно вывести только единицы тысяч
        System.out.printf("x = %d\ny = %d\nz = %d", x, y, z);


    }
}
