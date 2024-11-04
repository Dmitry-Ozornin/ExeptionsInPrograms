package HWA;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.*;

public class bloknot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите ЧЕРЕЗ ПРОБЕЛ Фамилию, Имя , Отчество, дату рождения в формате день.месяц.год(вводим числа через точку), номер телефона (целым числом без пробела и +), пол человека");
        String string = scanner.nextLine();
//        try {
        String[] data = string.split(" ");
        if (data.length != 6) {
            throw new IllegalArgumentException("Некорректный ввод, запустите программу заного и введите согласно требованиям данные!");
        }
        String lastName = data[0];
        String firstName = data[1];
        String patronymic = data[2];
        LocalDate birthday = parseData(data[3]);
        long phone = parsePhone(data[4]);
        String gender = parseGender(data[5]);


        System.out.println(gender);
//        }
    }

    public static LocalDate parseData(String datastr) throws DateTimeParseException  {

    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
    LocalDate birthday = LocalDate.parse(datastr, formatter);
    return birthday;




    }

    public static long parsePhone(String phone) {
        try {
            long i = Long.parseLong(phone);

            return i;

        } catch (NumberFormatException e){
            throw new IllegalArgumentException("Невернный ввод номера теолефона");
        }
        //Пытался через инт , но как бы не обраватвал и Integer.parseInt(phone) и Integer.parseInt(phone.trim()) все равно выдавал ошибку. Буду благодарен, если напишете почему так не работает, не понял почему так не переводит. Заране благодарю
    }

    public static String parseGender(String genderstr){
        String gender1 = "m";
        String gender2 = "f";
        String gender3 = "мужчина";
        String gender4 = "женщина";
        String gender5 = "male";
        String gender6 = "famale";
        String gender7 = "м";
        String gender8 = "ж";
        if (!(genderstr.equalsIgnoreCase(gender1) | genderstr.equalsIgnoreCase(gender2) | genderstr.equalsIgnoreCase(gender3) | genderstr.equalsIgnoreCase(gender4) | genderstr.equalsIgnoreCase(gender5) | genderstr.equalsIgnoreCase(gender6) | genderstr.equalsIgnoreCase(gender7) | genderstr.equalsIgnoreCase(gender8))) {
            throw new IllegalArgumentException("Введите общепринятый гендер");


        } else {
            if (genderstr.equalsIgnoreCase(gender1) || genderstr.equalsIgnoreCase(gender3) || genderstr.equalsIgnoreCase(gender5) || genderstr.equalsIgnoreCase(gender7)) {
                return gender1;
            } else {
                return gender2;
            }


        }
    }
}


