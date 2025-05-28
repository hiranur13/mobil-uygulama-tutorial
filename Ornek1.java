package com.example.uygulama1;

import java.util.Scanner;

public class Ornek1 {
    public static void main(String[] args) {
        int yazili1,yazili2,toplama,ortalama;
        Scanner oku=new Scanner(System.in);

        System.out.println("Yazılı 1 Gir:  ");
        yazili1=oku.nextInt();

        System.out.println("Yazılı 2 Gir: ");
        yazili2=oku.nextInt();

        ortalama=(yazili1+yazili2)/2;
        System.out.print("Ortalamanız: "+ortalama);

    }
}
