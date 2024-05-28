package com.berkan.deneme3;

import java.util.Scanner;

public class YeniOrnek {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Vize Notunu Giriniz");
        double not1= input.nextDouble();
        System.out.println("Final Notunu Giriniz");
        double not2= input.nextDouble();
        double sonuc=(not1*40/100)+(not2*60/100);
        System.out.println("Son Notunuz!");
        System.out.println(sonuc);

        if (sonuc>=90){
            System.out.println("Notunuz AA");
        } else if (sonuc>=80) {
            System.out.println("Notunuz BB");

        }
        else if (sonuc>=70) {
            System.out.println("Notunuz CC");

        }
        else if (sonuc>=60) {
            System.out.println("Notunuz DC");

        } else if (sonuc>50) {
            System.out.println("Notunuz DD");

        } else if (sonuc<=50) {
            System.out.println("Notunuz FF"+" Dersten Kaldınız :(");

        }
    }
}
