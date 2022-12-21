package com.cfuv.crypto.algorithm;

import java.util.Scanner;

public class cipher {
    static Scanner in = new Scanner(System.in);

    static void encrypt(String message) {
        message = message.toUpperCase();
        // получение ключа матрицы
        System.out.println("Укажите размер матрицы: ");
        int n = in.nextInt();
        System.out.println("Введите ключ шифрования: ");
        int[][] keyMatrix = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                keyMatrix[i][j] = in.nextInt();
            }
        }
        //проверка если определитель равен 0
        if (determinant(keyMatrix, n) % 26 == 0) {
            System.out.println("Неверный ключ, определитель равен 0.");
            return;
        }

        int[][] messageVector = new int[n][1];
        StringBuilder CipherText = new StringBuilder();
        int[][] cipherMatrix = new int[n][1];
        int j = 0;
        while (j < message.length()) {
            for (int i = 0; i < n; i++) {
                if (j >= message.length()) {
                    messageVector[i][0] = 23;
                } else
                    messageVector[i][0] = (message.charAt(j)) % 65;
                System.out.println(messageVector[i][0]);
                j++;
            }
            int x, i;
            for (i = 0; i < n; i++) {
                cipherMatrix[i][0] = 0;

                for (x = 0; x < n; x++) {
                    cipherMatrix[i][0] += keyMatrix[i][x] * messageVector[x][0];
                }
                System.out.println(cipherMatrix[i][0]);
                cipherMatrix[i][0] = cipherMatrix[i][0] % 26;
            }
            for (i = 0; i < n; i++)
                CipherText.append((char) (cipherMatrix[i][0] + 65));
        }
        System.out.println("[~] Зашифрованный текст: " + CipherText);
    }

    static void decrypt(String message) {
        message = message.toUpperCase();
        // получение ключа матрицы
        System.out.println("Укажите размер матрицы: ");
        int n = in.nextInt();
        System.out.println("Введите ключ расшифрования: ");
        int[][] keyMatrix = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                keyMatrix[i][j] = in.nextInt();
            }
        }
        //проверка если определитель равен 0
        if (determinant(keyMatrix, n) % 26 == 0) {
            System.out.println("Неверный ключ, определитель равен 0.");
            return;
        }
        //расшифровка
        int[][] messageVector = new int[n][1];
        StringBuilder PlainText = new StringBuilder();
        int[][] plainMatrix = new int[n][1];
        int j = 0;
        while (j < message.length()) {
            for (int i = 0; i < n; i++) {
                if (j >= message.length()) {
                    messageVector[i][0] = 23;
                } else
                    messageVector[i][0] = (message.charAt(j)) % 65;
                System.out.println(messageVector[i][0]);
                j++;
            }
            int x, i;
            for (i = 0; i < n; i++) {
                plainMatrix[i][0] = 0;

                for (x = 0; x < n; x++) {
                    plainMatrix[i][0] += keyMatrix[i][x] * messageVector[x][0];
                }

                plainMatrix[i][0] = plainMatrix[i][0] % 26;
            }
            for (i = 0; i < n; i++)
                PlainText.append((char) (plainMatrix[i][0] + 65));
        }
        System.out.println("[~] Расшифрованный текст: " + PlainText);
    }

    // калькулирование определителя
    public static int determinant(int[][] a, int n) {
        int det = 0, sign = 1, p, q;

        if (n == 1) {
            det = a[0][0];
        } else {
            int[][] b = new int[n - 1][n - 1];
            for (int x = 0; x < n; x++) {
                p = 0;
                q = 0;
                for (int i = 1; i < n; i++) {
                    for (int j = 0; j < n; j++) {
                        if (j != x) {
                            b[p][q++] = a[i][j];
                            if (q % (n - 1) == 0) {
                                p++;
                                q = 0;
                            }
                        }
                    }
                }
                det = det + a[0][x] * determinant(b, n - 1) * sign;
                sign = -sign;
            }
        }
        return det;
    }

    // меню
    static void hillcipher(String message) {
        System.out.println("Выберите действие, которое хотите выполнить над предложением: ");
        System.out.println("Введите [1]: для шифрования.");
        System.out.println("Введите [2]: для расшифрования.");
        short sc = in.nextShort();
        if (sc == 1)
            encrypt(message);
        else if (sc == 2)
            decrypt(message);
        else
            System.out.println("Ошибка! Значение может быть: 1 либо 2!");
    }
}
