//Задание №4 Реализуйте метод checkArray(Integer[] arr), принимающий в качестве аргумента целочисленный одномерный массив.
// Метод должен пройтись по каждому элементу и проверить что он не равен null.
// А теперь реализуйте следующую логику:
// 1. Если в какой-то ячейке встретился null, то необходимо “оповестить” об этом пользователя
// 2. Если null’ы встретились в нескольких ячейках, то идеально было бы все их “подсветить”
package ExceptionsInProgramming;

import java.util.ArrayList;
import java.util.List;

public class Task5 {
    public static void main(String[] args) {
        Integer[] arr = {1,null, 2,null,3};
        List<Integer> nullelement = checkArray(arr);
        if(nullelement.size() > 0){
            System.out.println("Macссив содержит пустые елементы на позициях" + nullelement);
        } else {
            System.out.println("Нет пустых элементов");
        }
    }

    public static List<Integer> checkArray(Integer[] arr){
        List<Integer> nullelement = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == null) {
                nullelement.add(i);

            }

        }
        return nullelement;
    }
}
