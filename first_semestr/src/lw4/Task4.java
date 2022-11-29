/*
4. Напишите программу, в которой создается двумерный массив, который
выводит прямоугольный треугольник;
 */

public class Task4 {
    public static void main(String[] args) {
        int triangleWidth = 10;
        int triangleHeight =  triangleWidth;
        String[][] triangle = new String[triangleHeight][triangleWidth];
        for (int triangleRow = 1; triangleRow < triangleHeight; ++triangleRow){
            for(int triangleSymbolCount = 0; triangleSymbolCount < triangleRow; ++triangleSymbolCount){
                triangle[triangleRow][triangleSymbolCount]="*  ";
                System.out.print(triangle[triangleRow][triangleSymbolCount]);


            }
            for(int triangleSpaceSymbolCount = 0; triangleSpaceSymbolCount < (triangleWidth - triangleRow);
            ++triangleSpaceSymbolCount){
                triangle[triangleRow][triangleSpaceSymbolCount]="8  ";
                System.out.print(triangle[triangleRow][triangleSpaceSymbolCount]);
            }
            System.out.print("\n");
        }

    }
}
