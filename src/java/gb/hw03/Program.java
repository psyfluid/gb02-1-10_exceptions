package gb.hw03;

import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class Program {

    public static final DateTimeFormatter dateFormatter;

    static {
        dateFormatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
    }

    public static void main(String[] args) {
        processData();
    }

    private static void processData() {
        String[] data = getStringArray();
        try {
            parseStringArray(data);
        } catch (InvalidDateException | InvalidPhoneException | InvalidGenderException e) {
            System.out.println(e.getMessage() + "\n");
            processData();
        }
    }

    private static void parseStringArray(String[] data) throws InvalidDateException, InvalidPhoneException,
            InvalidGenderException {
        int nameIndex = 0;
        LocalDate birthdate = null;
        String phone = "";
        String gender = "";

        int i = 0;
        while (i < data.length) {
            String s = data[i];
            if (isValidDate(s)) {
                try {
                    birthdate = LocalDate.parse(s, dateFormatter);
                    i++;
                } catch (DateTimeParseException e) {
                    throw new InvalidDateException();
                }
            } else if (isValidPhone(s)) {
                phone = s;
                i++;
            } else if (isValidGender(s)) {
                gender = s;
                i++;
            } else {
                nameIndex = i;
                i += 3;
            }
        }

        if (birthdate == null) {
            throw new InvalidDateException();
        }

        if (phone.isEmpty()) {
            throw new InvalidPhoneException();
        }

        if (gender.isEmpty()) {
            throw new InvalidGenderException();
        }

        try (FileWriter fw = new FileWriter("./" + data[nameIndex] + ".txt", true)) {
            StringBuilder sb = new StringBuilder();
            sb.append(data[nameIndex]).append(" ");
            sb.append(data[nameIndex + 1]).append(" ");
            sb.append(data[nameIndex + 2]).append(" ");
            sb.append(birthdate.format(dateFormatter)).append(" ");
            sb.append(phone).append(" ");
            sb.append(gender).append("\n");
            fw.append(sb.toString());
            fw.flush();
            System.out.println("Данные успешно записаны в файл");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static String[] getStringArray() {
        System.out.println("Введите свои данные в одну строку в следующем формате:");
        System.out.println("Фамилия Имя Отчество дата_рождения номер_телефона пол");
        System.out.println("где дата_рождения — строка формата dd.mm.yyyy,");
        System.out.println("номер_телефона — 11 цифр с кодом страны (для России — 7),");
        System.out.println("пол — символ f или m\n");
        String[] stringArray;
        try {
            stringArray = inputStringArray();
        } catch (EmptyStringException | WrongLengthException e) {
            stringArray = processInputException(e.getMessage());
        }
        return stringArray;
    }

    private static String[] processInputException(String e) {
        System.out.println(e + "\n");
        return getStringArray();
    }

    private static String[] inputStringArray() throws EmptyStringException, WrongLengthException {
        Scanner scanner = new Scanner(System.in);
        String result = scanner.nextLine();
        if (result.isEmpty()) throw new EmptyStringException();

        String[] resultArray = result.split(" ");
        if (resultArray.length != 6) throw new WrongLengthException();

        return resultArray;
    }

    private static boolean isValidDate(String date) {
        return date.matches("\\d{2}\\.\\d{2}.\\d{4}");
    }

    private static boolean isValidPhone(String phone) {
        return phone.matches("\\d{11}");
    }

    private static boolean isValidGender(String gender) {
        return gender.matches("^[fm]$");
    }

}
