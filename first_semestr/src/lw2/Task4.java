package lw2;

import java.util.Scanner;

/*
4. Напишите программу, которая проверяет, попадает ли введение
пользователем число в диапазон от 5 до 10 включительно.
 */
public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number");
        int x = scanner.nextInt();
        scanner.close();
        if(x>=5 && x<=10){
            System.out.printf("Number %d is satisfied the condition\n", x);
        }else{
            System.out.printf("Number %d doesn't satisfied the condition\n", x);
        }
    }
}
