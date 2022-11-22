package lw2;
/*
3. Напишите программу, которая проверяет, удовлетворяет ли введенное
пользователем число следующим критериям: число делится на 4, и при
этом оно не меньше 10.
 */

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number");
        int x = scanner.nextInt();
        scanner.close();

        if(x%4==0 && x>10){
            System.out.printf("Number %d is satisfies the condition\n", x);
        }else{
            System.out.printf("Number %d doesn't satisfies the condition\n", x);
        }

    }
}
