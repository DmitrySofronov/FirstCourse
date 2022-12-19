package lab4;

import java.util.Arrays;
import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите текст на английском языке для шифрования:");
        String text = scanner.nextLine();
        System.out.println("Введите ключ шифрования:");
        int key = scanner.nextInt();
        String encryptedText = encrypt(text, key);
        System.out.println("Текст после преобразования: " + encryptedText);
        System.out.println("Выполнить обратное преобразование? (y/n)");
        String answer = scanner.next();
        if (answer.equals("y")) {
            String decryptedText = decrypt(encryptedText, key);
            System.out.println("Текст после обратного преобразования: " + decryptedText);
        } else if (answer.equals("n")) {
            System.out.println("До свидания!");
        } else {
            System.out.println("Введите корректный ответ:");
        }
    }

    public static String encrypt(String text, int key) {
        StringBuilder encryptedText = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (Character.isLetter(ch)) {
                if (Character.isLowerCase(ch)) {
                    char c = (char) (ch + key);
                    if (c > 'z') {
                        encryptedText.append((char) (ch - (26 - key)));
                    } else {
                        encryptedText.append(c);
                    }
                } else if (Character.isUpperCase(ch)) {
                    char c = (char) (ch + key);
                    if (c > 'Z') {
                        encryptedText.append((char) (ch - (26 - key)));
                    } else {
                        encryptedText.append(c);
                    }
                }
            } else {
                encryptedText.append(ch);
            }
        }
        return encryptedText.toString();
    }

    public static String decrypt(String text, int key) {
        StringBuilder decryptedText = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (Character.isLetter(ch)) {
                if (Character.isLowerCase(ch)) {
                    char c = (char) (ch - key);
                    if (c < 'a') {
                        decryptedText.append((char) (ch + (26 - key)));
                    } else {
                        decryptedText.append(c);
                    }
                } else if (Character.isUpperCase(ch)) {
                    char c = (char) (ch - key);
                    if (c < 'A') {
                        decryptedText.append((char) (ch + (26 - key)));
                    } else {
                        decryptedText.append(c);
                    }
                }
            } else {
                decryptedText.append(ch);
            }
        }
        return decryptedText.toString();
    }
}

/*(дополнительная задача). Напишите программу
«Шифр Цезаря», в которой необходимо реализовать
собственный алфавит, остальные условия идентичны
задаче 8.*/

/*Напишите программу «Шифр Цезаря», которая
зашифровывает введенный текст. Используете кодовую
таблицу символов. При запуске программы в консоль
необходимо вывести сообщение: «Введите текст для
шифрования», после ввода текста, появляется
сообщение: «Введите ключ». После того как введены
все данные, необходимо вывести преобразованную
строку с сообщением «Текст после преобразования : ».
 Далее необходимо задать вопрос пользователю:
 «Выполнить обратное преобразование? (y/n)», если
пользователь вводит «y», тогда выполнить обратное
преобразование. Если пользователь вводит «n», того
программа выводит сообщение «До свидания!». Если
пользователь вводит что-то другое, отличное
от «y» или «n», то программа ему выводит сообщение:
«Введите корректный ответ».*/