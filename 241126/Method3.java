package com.example.uygulama1;

import java.util.Scanner;

public class Method3 {
    public static void main(String[] args) {

        int s1=5;
        int s2=9;

        System.out.println("Sonuç: "+farkHesapla(s1,s2));
    }
    public static int farkHesapla(int s1, int s2){
        int fark;
        if (s1>s2){
            fark=s1-s2;
        }
        else{
            fark=s2-s1;
        }
        return fark;

    }
}
