package com.example.uygulama1;

import java.util.Scanner;

public class Ornek2 {
    public static void main(String[] args) {
        Scanner oku=new Scanner(System.in);
        int sayi,toplam=0;
        for (int i=1;i<=10;i++){
            System.out.println(i+". Sayı");
            sayi= oku.nextInt();
            toplam+=sayi;
        }
        System.out.print("Toplam: "+toplam);
    }
}
