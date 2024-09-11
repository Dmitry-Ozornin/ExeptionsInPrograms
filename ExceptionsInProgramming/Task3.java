//Реализуйте метод, принимающий в качестве аргумента целочисленный двумерный массив. Необходимо посчитать и вернуть сумму элементов этого массива.
// При этом накладываем на метод 2 ограничения:
// метод может работать только с квадратными массивами (кол-во строк = кол-ву столбцов), и в каждой ячейке может лежать только значение 0 или 1.
// Если нарушается одно из условий, метод должен бросить RuntimeException с сообщением об ошибке.

package ExceptionsInProgramming;

public class Task3 {
    public static void main(String[] args) {
        int[][] matrix = {{1,0,1},{1,1,1}, {0,0,3}};
        int sum = sumEl(matrix);
        System.out.println(sum);

    }

    public static int sumEl(int[][] matrix){
        int n = matrix.length;
        for (int[] row: matrix){
            if(row.length !=n){
                throw new RuntimeException("Количество строк не равно воличеству столбцов");
            }
        }
        for (int[] row: matrix){
            for (int el : row){
                if(el != 0 && el != 1){
                    throw new RuntimeException("Массив должен содержать только 0 или 1");
                }
            }
        }
        int sum = 0;
        for(int[] row: matrix){
            for (int element: row){
                sum += element;
            }
        }
        return sum;
    }
}
