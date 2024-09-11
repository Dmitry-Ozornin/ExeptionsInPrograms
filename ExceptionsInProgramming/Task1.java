//Реализуйте метод, принимающий в качестве аргумента целочисленный массив.
// Если длина массива меньше некоторого заданного минимума, метод возвращает -1 в качестве кода ошибки, иначе - длину массива.

package ExceptionsInProgramming;

public class Task1 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        int min_lenght =  3;
        int res = checkArrayLength(arr,min_lenght);
        System.out.println(res);
    }

    public static int checkArrayLength(int[] arr, int min_lenght){
        if(arr.length < min_lenght){
            return -1;
        } else {
            return arr.length;
        }
    }
}
