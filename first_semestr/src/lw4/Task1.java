/*
1. Напишите программу, которая выводить в консольное окно
прямоугольник, размеры сторон которого, ширина: 23 колонки, высота: 11
строк;
 */

public class Task1 {
    public static void main(String[] args) {
        for(int row = 0; row<10; ++row){
            for (int column = 0; column<23; ++column)
                System.out.printf("|%d|",column);
            System.out.printf("\n");
        }
    }
}
