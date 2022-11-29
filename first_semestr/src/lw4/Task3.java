/*
3. Напишите программу, в которой создается двумерный массив, который
выводи прямоугольник из цифр 2;
 */
public class Task3 {
    public static void main(String[] args) {
        int width = 6;
        int heigth = 4;
        int[][] box = new int[heigth][width];
        for (int i=0; i<heigth; ++i){
            for(int j=0; j<width; ++j){
                box[i][j]=2;
                System.out.print(box[i][j] + " ");
            }
            System.out.print("\n");
        }

    }
}
