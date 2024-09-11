//Реализуйте метод, принимающий в качестве аргументов два целочисленных массива и возвращающий новый массив,
// каждый элемент которого равен сумме элементов двух входящих массивов в той же ячейке.
// Если длины массивов не равны, необходимо как-то оповестить пользователя.
package ExceptionsInProgramming;

import java.util.Arrays;

public class Task7 {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3};
        int[] arr2 = {1, 2};
        try {
            int[] res = sumElMas(arr1, arr2);
            System.out.println(Arrays.toString(res));
        }catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }


    }
    public static int[] sumElMas(int[] arr1, int[] arr2) throws IllegalArgumentException{
        if (arr1.length != arr2.length) {
            throw new IllegalArgumentException("массивы имеют разную длинну");
        }

    int[] res = new int[arr1.length];
            for (int i = 0; i < arr1.length; i++) {
        res[i] = arr1[i] + arr2[i];

    }
            return res;
}

}
