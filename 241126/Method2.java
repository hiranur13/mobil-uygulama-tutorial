package com.example.uygulama1;

import java.util.Scanner;

public class Method2 {
    public static void main(String[] args) {
        Scanner oku=new Scanner(System.in);
        System.out.println("Sayı Gir:");
        int sayi= oku.nextInt();

        System.out.println("Sayı:"+sayi);

        kareAl(sayi);

    }
    public static int kareAl(int sayi){
        return sayi*sayi;
    }
}
