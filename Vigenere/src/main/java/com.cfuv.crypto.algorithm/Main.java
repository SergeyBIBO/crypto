package com.cfuv.crypto.algorithm;

import java.util.Scanner;

import static com.cfuv.crypto.algorithm.Vigenere.decrypt;
import static com.cfuv.crypto.algorithm.Vigenere.encrypt;

public class Main {

    public static void main(String[] args) {

        System.out.println("[~] Система шифрования по Виженеру [~]\n");
        Scanner in = new Scanner(System.in);

        //	Выбор нужной процедуры
        System.out.println("[~] Введите [1] чтобы зашифровать текст. [~]");
        System.out.println("[~] Введите [2] чтобы расшифровать текст. [~]");
        int input = in.nextInt();

        if (input == 1) {
            System.out.print("[~] Введите ключ шифрования: ");
            String key = in.next();
            System.out.print("[~] Введите текст, который необходимо зашифровать: ");
            String EMessage = in.next();
            String encryptMessage = encrypt(EMessage, key);
            System.out.println("[~] Зашифрованное сообщение: " + encryptMessage);
        }
        else if (input == 2) {
            System.out.print("[~] Введите ключ шифрования: ");
            String key = in.next();
            System.out.print("[~] Введите текст, который необходимо расшифровать: ");
            String DMessage = in.next();
            String decryptMessage = decrypt(DMessage, key);
            System.out.println("[~] Расшифрованное сообщение: " + decryptMessage);
        }
        else {
            System.out.println("[~] Ошибка! Необходимо ввести либо 1 либо 2!");
        }
        in.close();
    }
}