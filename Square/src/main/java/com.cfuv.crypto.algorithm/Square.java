package com.cfuv.crypto.algorithm;

public class Square {
    static int[][] kvadrat = { {1, 8, 13, 12}, {14, 11, 2, 7},
                                {4, 5, 16, 9}, {15, 10, 3, 6} };
    static char[][] shifr = { {'a', 'h', 'm', 'l'}, {'n', 'k', 'b', 'g'},
                            {'d', 'e', 'p', 'i'},   {'o', 'j', 'c', 'f'} };
    static void addChar(int index, char ch) {
        CycleEncrypt:
        for (int i = 0; i <= kvadrat.length - 1; i++) {
            for (int j = 0; j <= kvadrat[i].length - 1; j++) {
                if (kvadrat[i][j] == index) {
                    shifr[i][j] = ch;
                    break CycleEncrypt;
                }
            }
        }
    }
}