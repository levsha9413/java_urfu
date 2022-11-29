import java.util.Random;

/*
5. Напишите программу, в которой создается двумерный целочисленный
массив. Он заполняется случайными числами. Затем в этом массиве строи и
столбцы меняются местами: первая строка становится первым столбцом,
вторая строка становиться вторым столбцом и так далее. Например, если
исходный массив состоял из 3 строк и 5 столбцов, то в итоге получаем массив
из 5 строк и 3 столбцов.
 */
public class Task5 {
    public static void main(String[] args) {
        int[][] originalArray = new int[3][5];
        int[][] cloneArray = new int[originalArray[0].length][originalArray.length];
        Random random = new Random();
        System.out.println("Original array:");
        for (int i = 0; i< originalArray.length; ++i){
            for(int j = 0; j<originalArray[i].length; ++j){
                originalArray[i][j]= random.nextInt(100);
                System.out.print(originalArray[i][j] + " ");
            }
            System.out.print("\n");
        }
        for(int i=0; i<originalArray[0].length; ++i){
            for(int j = 0; j<originalArray.length;++j){
                cloneArray[i][j]=originalArray[j][i];
            }
        }
        originalArray = cloneArray;
        System.out.println("Resvers originalArray:");

        for(int i=0; i< originalArray.length; i++){
            for (int j=0; j<originalArray[i].length; ++j){
                System.out.print(originalArray[i][j]+" ");
            }
            System.out.print("\n");
        }
    }

}
