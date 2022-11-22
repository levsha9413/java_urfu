package lw2;

import java.util.Scanner;

/*
1. Напишите программу, которая проверяет, делится ли введенное
Пользователем число на 3.
 */
public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number:");
        int x = scanner.nextInt();
        scanner.close();
        if(x%3 == 0){
            System.out.println("This number is divisible by 3");
        }else {
            System.out.println("This number doesn't divisible by 3");
        }
    }
}
