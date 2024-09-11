/*
Напишите программу для выполнения арифметической операции деления двух целых чисел a и b.
При этом программа должна проверить, что делитель b не равен нулю, и выполнить деление только в этом случае.
Если b равен нулю, программа должна вернуть результат равный нулю.
После выполнения операции деления, программа также должна вывести сумму чисел a и b с помощью метода printSum.
Если аргументы не переданы через командную строку, используйте значения по умолчанию.

На входе:


'12'
'5'
На выходе:


17
2.4
 */

import java.util.ArrayList;
import java.util.List;

class Expr5 {

    public static double expr(int a, int b) {
        // Введите свое решение ниже
        if(b == 0) {
            return 0;
        }else {
            double res = (double) a / b;
            return res;
        }



    }

    public static int printSum(int a, int b) {
        int res = a + b;
        return res;



        // Введите свое решение ниже

    }
}

// Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки

public class Hw6 {
    public static void main(String[] args) {
        int a;
        int b;

        if (args.length == 0) {
            a = 12;
            b = 5; // Default values if no arguments are provided
        } else {
            a = Integer.parseInt(args[0]);
            b = Integer.parseInt(args[1]);
        }
        int res = Expr5.printSum(a,b);
        System.out.println(res);
        double result = Expr5.expr(a, b);
        System.out.println(result);

    }
}