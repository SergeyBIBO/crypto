package com.cfuv.crypto.algorithm;

import com.cfuv.crypto.algorithm.StrUtil;
import java.util.Scanner;

import static com.cfuv.crypto.algorithm.StrUtil.decryption;
import static com.cfuv.crypto.algorithm.StrUtil.encryption;

public class App {
    public static void main(String[] args){
        String code;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String str = sc.nextLine();
        System.out.println("Encrypt: " + encryption(str, 20));
        code = StrUtil.encryption(str,20);
        System.out.println("Decrypt: " + decryption(code, 20));

    }
}
