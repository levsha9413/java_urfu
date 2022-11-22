/*
9. Напишите программу, в которой создается массив и заполняется
случайными числами. Массив отображается в консольном окне. В этом
массиве необходимо определить элемент с минимальным значением. В
частности, программа должна вывести значение элемента с минимальным
значением и индекс этого элемента. Если элементов с минимальным
значением несколько, должны быть выведены индексы всех этих элементов.
 */

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the range of array:");
        int limit = scanner.nextInt();
        scanner.close();
        int[] numbers = new int[limit];
        Random random = new Random();
        for (int i=0; i<numbers.length; ++i) {
            numbers[i] = random.nextInt(200);
        }
        int[] sortNumbers = numbers.clone();
        Arrays.sort(sortNumbers);
        System.out.printf("Lower number in array is %d. Its indexes:\n ", sortNumbers[0] );

        for (int i=0; i<numbers.length; ++i){
            if(numbers[i]==sortNumbers[0]){
                System.out.println(i);
            }

        }
    }
}
