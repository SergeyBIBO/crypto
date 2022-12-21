package com.cfuv.crypto.algorithm;

import static com.cfuv.crypto.algorithm.cipher.hillcipher;
import static com.cfuv.crypto.algorithm.cipher.in;

public class cipherapp {
    public static void main(String[] args) {
        // считывания предложения для дальнейшних действий
        System.out.println("Введите предложение на английской раскладке: ");
        String message = in.nextLine();
        hillcipher(message);
    }
}
