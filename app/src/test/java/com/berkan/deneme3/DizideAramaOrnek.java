package com.berkan.deneme3;
import java.util.Scanner;
public class DizideAramaOrnek {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int arraysLength = 10;
        String[] kullaniciAd = new String[arraysLength];


        for (int i = 0; i < arraysLength; i++) {
            System.out.println((i + 1) + ". Kullanıcıyı Giriniz:");
            kullaniciAd[i] = input.next();
        }

        System.out.println("Kontrol Etmek İstediğiniz Kullanıcı Adını Giriniz:");
        String kullaniciKontrol = input.next();

        boolean varyok = false;
        for (int i = 0; i < kullaniciAd.length; i++) {
            if (kullaniciAd[i].equals(kullaniciKontrol)) {
                varyok = true;
                break;
            }
        }

        if (varyok) {
            System.out.println("Dizide var");
        } else {
            System.out.println("Dizide yok");
        }


    }
}
