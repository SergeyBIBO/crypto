package com.cfuv.crypto.algorithm;
public class Euclide
{
    static int gcd(int a, int b) // Нахождение НОД
    {
        if(a % b == 0)
        {
            return b;
        }
        int r = a % b;
        return gcd(b,r);
    }
    static int inverse(int a, int b) // Нахождение ИНВЕРСИИ
    {
        int[] m = {1, 0, a};
        int[] n = {0, 1, b};
        int[] temp = new int[3];
        int q;
        boolean flag = true;
        while (flag) {
            q = m[2] / n[2];
            for (int i = 0; i < 3; i++) {
                temp[i] = m[i] - q * n[i];
                m[i] = n[i];
                n[i] = temp[i];
            }
            if (n[2] == 1) {
                if (n[1] < 0)
                    n[1] = n[1] + a;
                return n[1];
            }
            if (n[2] == 0)
                flag = false;
        }
        System.out.println("[~] Обратного элемента не существует! Инверсия не найдена! [~]");
        return 0;
    }
}
