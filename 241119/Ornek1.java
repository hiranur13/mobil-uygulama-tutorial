package com.example.uygulama1;

import java.util.Scanner;

public class Ornek1 {
    public static void main(String[] args) {
        Scanner oku=new Scanner(System.in);
        double y1,y2;
        System.out.print("1. Yazılı Giriniz: ");
        y1= oku.nextDouble();
        System.out.print("2. Yazılı Giriniz: ");
        y2= oku.nextDouble();

        double ortalama=ortalama(y1,y2);
        System.out.println("Ortalama: "+ortalama);


    }
    private static double ortalama(double y1,double y2){
        return (y1+y2)/2;
    }

}
