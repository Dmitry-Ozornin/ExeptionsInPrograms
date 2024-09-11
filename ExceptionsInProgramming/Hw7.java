/*
Напишите программу, которая принимает символ a в качестве аргумента и выполняет следующую проверку:
если символ a равен пробелу '', программа должна выбрасывать исключение с сообщением
"Empty string has been input.".
В противном случае программа должна возвращать сообщение
"Your input was - [символ]", где [символ] заменяется на введенный символ a.
 */

class Expr7 {
    public static String expr(char a) throws Exception {
// Введите свое решение ниже
        String str = new String();
        str = String.valueOf(a);

        return str;





    }
}
// Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки

public class Hw7 {
    public static void main(String[] args) {
        char a;

        if (args.length == 0) {
            a = ' '; // Значение по умолчанию, если аргументы не были предоставлены
        } else {
            a = args[0].charAt(0); // Преобразуйте первый аргумент командной строки в символ
        }

        try {
            String result = Expr7.expr(a);
            if(result.equals(" ")){
                throw new RuntimeException("Empty string has been input.");

            }else{
                System.out.println("Result: Your input was - " + result);
            }

        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}
