package lab4;

import java.util.Scanner;

public class Task9_RU {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите текст для шифрования:");
        String plainText = input.nextLine();
        System.out.println("Введите ключ:");
        int key = input.nextInt();

        String alphabet = "абвгдеёжзийклмнопрстуфхцчшщъыьэюя";
        StringBuilder encryptedText = new StringBuilder();

        for (int i = 0; i < plainText.length(); i++) {
            char currentChar = plainText.charAt(i);
            int index = alphabet.indexOf(currentChar);
            int newIndex = (index + key) % alphabet.length();
            char newChar = alphabet.charAt(newIndex);
            encryptedText.append(newChar);
        }

        System.out.println("Текст после преобразования: " + encryptedText);

        System.out.println("Выполнить обратное преобразование? (y/n)");
        String answer = input.next();
        while (!answer.equals("y") && !answer.equals("n")) {
            System.out.println("Введите корректный ответ:");
            answer = input.next();
        }

        if (answer.equals("y")) {
            StringBuilder decryptedText = new StringBuilder();
            for (int i = 0; i < encryptedText.length(); i++) {
                char currentChar = encryptedText.charAt(i);
                int index = alphabet.indexOf(currentChar);
                int newIndex = (index - key + alphabet.length()) % alphabet.length();
                char newChar = alphabet.charAt(newIndex);
                decryptedText.append(newChar);
            }
            System.out.println("Текст после обратного преобразования: " + decryptedText);
        } else {
            System.out.println("До свидания!");
        }
    }
}

