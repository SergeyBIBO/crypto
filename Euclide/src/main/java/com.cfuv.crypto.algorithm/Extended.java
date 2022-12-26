package com.cfuv.crypto.algorithm;

import java.util.Scanner;

public class Extended
{
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("[~] Введите значение [A]: ");
        int a = sc.nextInt();
        System.out.print("[~] Введите значение [B]: ");
        int b = sc.nextInt();

        int r0=a, r=b, r1=r0%r, q=r0/r, x0=1, x=0, x1=x0-q*x, y0=0, y=1, y1=y0-q*y;

        while (r1>0)
        {
            x0=x;
            x=x1;
            y0=y;
            y=y1;
            r0=r;
            r=r1;
            q=r0/r;
            r1=r0%r;
            x1=x0-q*x;
            y1=y0-q*y;

        }
        System.out.println("\n[~] НОД: "+ r +"\n[~] X: "+ x +"\n[~] Y: "+ y);
    }
}