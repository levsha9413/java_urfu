/*
10. Напишите программу, в которой создается целочисленный
массив, заполняется случайными числами и после этого значения элементов в
массиве сортируются в порядке убывания значений.
 */

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the limit for array:");
        int limit = scanner.nextInt();
        scanner.close();
        int[] numbers = new int[limit];
        Random random = new Random();
        for(int i = 0; i<numbers.length; ++i){
            numbers[i]= random.nextInt(100);
        }
        Arrays.sort(numbers);
        for (int number:numbers) {
            System.out.println(number);

        }
    }
}
