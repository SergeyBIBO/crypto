package com.cfuv.crypto.algorithm;

import java.util.Scanner;

import static com.cfuv.crypto.algorithm.Square.addChar;
import static com.cfuv.crypto.algorithm.Square.shifr;

public class Main {

    public static void main(String[] args) {

        System.out.println("[~] Впешите текст, который вы хотите зашифровать: ");
        Scanner scanner = new Scanner(System.in);
        String text = scanner.next();
        char[] msg = text.toCharArray();

        for (int i = 0; i <= msg.length - 1; i++)
            addChar(i + 1, msg[i]);

        StringBuilder builder = new StringBuilder();

        for (int q = 0; q < shifr.length - 1; q++)
            builder.append(shifr[q]);

        System.out.println("[~] Зашифрованный текст: " + builder);
    }
}