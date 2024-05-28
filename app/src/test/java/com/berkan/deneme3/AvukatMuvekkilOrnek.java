package com.berkan.deneme3;

import java.util.Scanner;

public class AvukatMuvekkilOrnek {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int arraysLength = 5;
        int[] dosyaNumarasi = new int[arraysLength];
        String[] muvekkilAdi = new String[arraysLength];
        String[] durusmaYeri = new String[arraysLength];

        for (int j = 0; j < arraysLength; j++) {
            System.out.println((j + 1) + ". Dosya Numarası Giriniz:");
            dosyaNumarasi[j] = input.nextInt();
            input.nextLine();
            System.out.println((j + 1) + ". Müvekkil Adı Giriniz:");
            muvekkilAdi[j] = input.nextLine();
            System.out.println((j + 1) + ". Durusma Yeri Giriniz:");
            durusmaYeri[j] = input.nextLine();
        }

        System.out.println("Aranacak Müvekkil Dosya Numarasını Giriniz:");
        int muvekkilKontrol = input.nextInt();

        boolean varyok = false;
        int muvekkilbul = -1;
        for (int i = 0; i < dosyaNumarasi.length; i++) {
            if (dosyaNumarasi[i] == muvekkilKontrol) {
                varyok = true;
                muvekkilbul = i;
                break;
            }
        }

        if (varyok) {
            System.out.println(dosyaNumarasi[muvekkilbul] + " Numaralı Müvekkilin Adı: " + muvekkilAdi[muvekkilbul] + ", Durusma Yeri: " + durusmaYeri[muvekkilbul]);
        } else {
            System.out.println("Böyle bir kayıt yok");
        }

        input.close();
    }
}
