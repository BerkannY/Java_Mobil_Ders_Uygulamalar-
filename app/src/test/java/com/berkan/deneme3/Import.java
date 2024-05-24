package com.berkan.deneme3;

import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;
import java.util.Scanner;
public class Import {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
       /* System.out.println("Sayı giriniz");
        int a = input.nextInt();
        int sonuc=0;
        for (int i =0; i<=a; i++){
            sonuc+=i;
        }
        System.out.println("Sonuç");
        System.out.println(sonuc);

        */



        /*System.out.println("Sayı giriniz");
        int a = input.nextInt();
        int sonuc=1;
        for (int i =1; i<=a; i++){
            sonuc*=i;
        }
        System.out.println("Sonuç");
        System.out.println(sonuc);

         */
        System.out.println("1.Sayıyı giriniz");
        int say1= input.nextInt();
        System.out.println("2.Sayıyı giriniz");
        int say2= input.nextInt();
        int sonuc1=1;
        for (int i=1; i<=say1; i++){
            sonuc1*=i;
        }
        System.out.println("1.Sayının Faktöriyeli");
        System.out.println(sonuc1);
        int sonuc2=1;
        for (int sayac =1; sayac<=say2;sayac++){
            sonuc2*=sayac;
        }
        System.out.println("2.Sayının Faktöriyeli");
        System.out.println(sonuc2);
        int sonuc3=sonuc1+sonuc2;
        System.out.println("Girilen İki Sayının Faktörityellerinin toplamı");
        System.out.println(sonuc3);




    }
}
