/*
2. Напишите программу, которая выводит в консольное окно
прямоугольный треугольник;
 */

public class Task2 {
    public static void main(String[] args) {
        int triangleWidth = 10;
        for (int row=1; row<11; ++row){


            for (int countTriangleSymbols=0; countTriangleSymbols<row; ++countTriangleSymbols){
                System.out.print("*  ");
            }
            for(int countSpaceSymbol = 0; countSpaceSymbol < (triangleWidth - row); ++countSpaceSymbol ){
                System.out.print("8  ");
            }
            System.out.print("\n");
        }
    }
}
