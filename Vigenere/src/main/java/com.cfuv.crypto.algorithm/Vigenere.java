package com.cfuv.crypto.algorithm;

public class Vigenere {

    public static String encrypt(String Message, String Key) {
        StringBuilder EMessage = new StringBuilder();
        Message = Message.toUpperCase();
        for (int i = 0, j = 0; i < Message.length(); i++) {
            char letter = Message.charAt(i);
            EMessage.append((char) (((letter - 65) + (Key.charAt(j) - 65)) % 26 + 65));
            j = ++j % Key.length();
        }
        return EMessage.toString();
    }
    public static String decrypt(String Message, String Key) {
        StringBuilder DMessage = new StringBuilder();
        Message = Message.toUpperCase();
        for (int i = 0, j = 0; i < Message.length(); i++) {
            char letter = Message.charAt(i);
            DMessage.append((char) ((letter - Key.charAt(j) + 26) % 26 + 65));
            j = ++j % Key.length();
        }
        return DMessage.toString();
    }
}