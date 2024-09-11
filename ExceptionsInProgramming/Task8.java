//Реализуйте метод, принимающий в качестве аргументов двумерный массив.
// Метод должен проверить что длина строк и столбцов с одинаковым индексом одинакова,
// детализировать какие строки со столбцами не требуется.
// Как бы вы реализовали подобный метод?
package ExceptionsInProgramming;

public class Task8 {
    public static void main(String[] args) {
        int[][] arr = {{1,2,3},{4,5,6},{7,8}};
        if(checkArray(arr)){
            System.out.println("Количнство строк и столбцов совпадает");
        } else {
            System.out.println("количество строк и стобцов не совпадает");
        }

    }

    public static boolean checkArray(int[][] arr){
        int row = arr.length;
        if(row == 0){
            return true;
        }
        for (int i = 0; i <row ; i++) {
            if(arr[i].length!= row){
                return false;
            }

        }
        return true;
    }
}
