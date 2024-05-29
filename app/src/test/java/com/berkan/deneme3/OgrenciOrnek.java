package com.berkan.deneme3;

import java.util.ArrayList;
import java.util.Scanner;

public class OgrenciOrnek {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<String> ogrenciler = new ArrayList<>();
        System.out.println("Kaydetmek İstediğiniz öğrenci sayısını giriniz...");
        int sayi = input.nextInt();
        for (int i =0; i<sayi;i++){
            System.out.println((i+1)+". Öğrenci Adını Giriniz...");
            String ogrenciAdi = input.next();
            ogrenciler.add(ogrenciAdi);
        }
        System.out.println("Tüm Öğrenciler Başarıyla Eklenmiştir...");
        System.out.println("----------------------------------------");
        System.out.println("EKLENEN ÖĞRENCİLER LİSTESİ");
        for (int i=0; i< sayi;i++){
            System.out.println(ogrenciler.get(i));
        }

    }
}
