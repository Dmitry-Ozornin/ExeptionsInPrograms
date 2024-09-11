//Реализуйте 3 метода, чтобы в каждом из них получить разные исключения.
//
//Метод arrayOutOfBoundsException - Ошибка, связанная с выходом за пределы массива
//
//Метод divisionByZero - Деление на 0
//
//Метод numberFormatException - Ошибка преобразования строки в число
//
//Важно: они не должны принимать никаких аргументов
//package ExceptionsInProgramming;

//public class Hw1 {
//    class Answer {
//        public static void arrayOutOfBoundsException() {
//            // Напишите свое решение ниже
//            int[] arr = {1,2,3};
//            System.out.println(arr[3]);
//
//        }
//
//        public static void divisionByZero() {
//            // Напишите свое решение ниже
//            int a = 10;
//            int b = 0;
//            int res = a / b;
//            System.out.println(res);
//
//        }
//
//        public static void numberFormatException() {
//            // Напишите свое решение ниже
//            String string = "abc";
//            int num = Integer.parseInt(string);
//            System.out.println(num);
//        }
//    }
//
//    public class Printer {
//        public static void main(String[] args) {
//            Answer ans = new Answer();
//            try {
//                ans.arrayOutOfBoundsException();
//            } catch (ArrayIndexOutOfBoundsException e) {
//                System.out.println("Выход за пределы массива");
//            }
//
//            try {
//                ans.divisionByZero();
//            } catch (ArithmeticException e) {
//                System.out.println("Деление на ноль");
//            }
//
//            try {
//                ans.numberFormatException();
//            } catch (NumberFormatException e) {
//                System.out.println("Ошибка преобразования строки в число");
//            }
//        }
//    }
//}
