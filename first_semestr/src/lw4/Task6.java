import java.util.Random;

/*
6. Напишите программу, в которой создается и инициализируется
двумерный числовой массив. Затем из этого массива удаляется строка и
столбец (создается новый массив, в котором по сравнению с исходным
удалена одна строка и один столбец). Индекс удаляемой строки и индекс
удаляемого столбца определяется с помощью генератора случайных чисел.
 */
public class Task6 {
    public static void main(String[] args) {
        Random random = new Random();
        int[][] originalArray=new int[random.nextInt(3,10)][random.nextInt(3,10)];
        int[][] duplicateArray=new int[originalArray.length][originalArray[0].length];
        int deletedRow = random.nextInt(duplicateArray.length);
        int deleteColumn = random.nextInt(duplicateArray[0].length);
        for(int row = 0; row<originalArray.length; ++row){
            for(int column=0; column<originalArray[row].length; ++column){
                System.out.print((originalArray[row][column]= random.nextInt(100))+"  ");
            }
            System.out.print("\n");
        }
        System.out.println("Deleted row:" + deletedRow);
        System.out.println("Deleted column:" + deleteColumn);
        System.out.println("Duplicate array:");
        int originalRow;
        int duplicateRow;
        int originalColumn;
        int duplicateColumn;
        for(duplicateRow=0, originalRow=0; duplicateRow< originalArray.length; ++originalRow, ++duplicateRow){
            if(duplicateRow!=deletedRow){
                for(duplicateColumn=0, originalColumn=0; duplicateColumn<originalArray[duplicateRow].length;
                ++originalColumn, ++duplicateColumn){
                    if(duplicateColumn!=deleteColumn){
                        System.out.print((duplicateArray[duplicateRow][duplicateColumn]=
                                originalArray[originalRow][originalColumn])+"  ");
                    }else{
                        continue;
                    }
                }
                System.out.print("\n");
            }else{
                continue;
            }
        }
    }
}
