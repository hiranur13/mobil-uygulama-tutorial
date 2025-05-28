package com.example.uygulama1;

import java.util.Scanner;

public class Ornek4 {
    public static void main(String[] args) {
        Scanner oku=new Scanner(System.in);
        int sayi,toplam=0;
        System.out.print("Bir Sayı Giriniz:");
        sayi= oku.nextInt();

        for(int i=1;i<sayi;i++){
            toplam+=i;
        }
        System.out.print("Toplam: "+toplam);
    }
}
