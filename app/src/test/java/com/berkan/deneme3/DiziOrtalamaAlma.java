package com.berkan.deneme3;

import java.util.Scanner;

public class DiziOrtalamaAlma {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int arraysLength = 3;

        double[] vize = new double[arraysLength];
        double[] finall = new double[arraysLength];
        String[] kullaniciAd = new String[arraysLength];
        double[] ortalama = new double[arraysLength];


        for (int j = 0; j < arraysLength; j++) {
            System.out.println((j + 1) + ". Kullanıcıyı Giriniz:");
            kullaniciAd[j] = input.next();

            System.out.println((j + 1) + ". Kullanıcı için Vize Notunu Giriniz:");
            vize[j] = input.nextDouble();
            System.out.println((j + 1) + ". Kullanıcı için Final Notunu Giriniz:");
            finall[j] = input.nextDouble();


            // ORTALAMA ALMA
            ortalama[j] = ((vize[j] * 0.4) + (finall[j] * 0.6));
            //System.out.println(kullaniciAd[j] + " kullanıcısının ortalaması: " + ortalama[j]);
        }

        System.out.println("Aranacak Öğrencinin İsmini Giriniz:");
        String kullaniciKontrol = input.next();

        boolean varyok = false;
        int ogrencibul = -1;
        for (int i = 0; i < kullaniciAd.length; i++) {
            if (kullaniciAd[i].equals(kullaniciKontrol)) {
                varyok = true;
                ogrencibul = i;
                break;
            }
        }

        if (varyok) {
            System.out.println(kullaniciAd[ogrencibul] + " isimli öğrencinin ortalaması: " + ortalama[ogrencibul]);
        } else {
            System.out.println("Böyle bir i yok");
        }

        input.close();
    }
}
