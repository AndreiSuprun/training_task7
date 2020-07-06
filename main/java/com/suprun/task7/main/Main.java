package com.suprun.task7.main;

import java.util.Locale;
import java.util.ResourceBundle;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            System.out.printf("Введите, пожалуйста, число, соответствующее языку выводимых сообщений, " +
                    "согласно следующим данным:%n1 - для английского языка, 2 - для белорусского, любое " +
                    "другое число - для языка по умолчанию%n");
            int languageNumber = 0;
            while (!scanner.hasNextInt()) {
                System.out.println("Введите, пожалуйста,число");
                scanner.next();
            }
            languageNumber = scanner.nextInt();
            String country = "";
            String language = "";
            switch (languageNumber) {
                case 1: {
                    country = "US";
                    language = "en";
                    break;
                }
                case 2: {
                    country = "BY";
                    language = "be";
                    break;
                }
            }
            Locale locale = new Locale(language, country);
            ResourceBundle resourceBundle = ResourceBundle.getBundle("property.text", locale);
            String string1 = resourceBundle.getString("string1");
            System.out.println(string1);
            String string2 = resourceBundle.getString("string2");
            System.out.println(string2);
        }
    }
}