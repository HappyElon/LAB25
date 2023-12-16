package ru.mirea.LAB25.task2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NumberCheck {
    public static void main(String[] args) {
        String inputText = "(1 + 8) - 9 / 4";

        String pattern = "\\b\\d+\\s*[^+]\\s*\\d+\\b";

        Pattern regex = Pattern.compile(pattern);

        Matcher matcher = regex.matcher(inputText);

        if (matcher.find()) {
            System.out.println("В тексте есть цифры, за которыми не стоит знак '+'");
        } else {
            System.out.println("В тексте нет цифр, за которыми не стоит знак '+'");
        }
    }
}

