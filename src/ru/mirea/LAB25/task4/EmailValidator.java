package ru.mirea.LAB25.task4;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailValidator {
    public static void main(String[] args) {
        String[] testEmails = {"user@example.com", "root@localhost", "myhost@@@com.ru", "@my.ru", "Julia String"};

        String emailPattern = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";
        Pattern pattern = Pattern.compile(emailPattern);

        for (String email : testEmails) {
            Matcher matcher = pattern.matcher(email);
            if (matcher.matches()) {
                System.out.println(email + " - Является допустимым e-mail адресом");
            } else {
                System.out.println(email + " - Не является допустимым e-mail адресом");
            }
        }
    }
}

