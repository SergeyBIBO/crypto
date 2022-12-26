package com.cfuv.crypto.algorithm;

import java.util.Scanner;

import static com.cfuv.crypto.algorithm.Euclide.gcd;
import static com.cfuv.crypto.algorithm.Euclide.inverse;

public class Main {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("[~] Введите значение [A]: ");
        int a = sc.nextInt();
        System.out.print("[~] Введите значение [B]: ");
        int b = sc.nextInt();
        System.out.println("[~] Результат НОД: " + gcd(a,b));
        System.out.println("[~] Результат ИНВЕРСИИ: " + inverse(a,b));
    }
}