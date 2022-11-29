import java.util.Random;

/*
7. Напишите программу, в которой создается двумерный числовой массив
и этот массив заполняется «змейкой»: сначала первая строка (слева направо),
затем последний столбец (снизу вверх), вторая строка (слева направо) и так
далее.
 */
public class Task7 {
    public static void main(String[] args) {
        Random random = new Random();
        int[][] Snake = new int[random.nextInt(3,10)][random.nextInt(3,10)];
        int rowLimiter = 0;
        int columnLimiter = Snake[0].length;
        int i = 2;
        while ((rowLimiter<Snake.length) && (columnLimiter>0)) {
            for (int column = 0; column < columnLimiter; ++column) {
                Snake[rowLimiter][column] = i;
            }
            --columnLimiter;
            ++i;
            for (int row = Snake.length - 1; row > rowLimiter; --row) {
                Snake[row][columnLimiter] = i;
            }
            ++rowLimiter;
            ++i;
        }
    }
}
