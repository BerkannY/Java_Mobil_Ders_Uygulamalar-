package com.berkan.deneme3;

import java.util.ArrayList;
import java.util.Scanner;

public class MagazaOtomasyonu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<String> urunAdlari = new ArrayList<>();
        ArrayList<Integer> urunFiyatlari = new ArrayList<>();
        ArrayList<Integer> urunStoklari = new ArrayList<>();
        System.out.println("Market Otomasyona Hoş Geldiniz");

        while (true) {
            System.out.println("Yapmak İstediğiniz işlemi seçiniz");
            System.out.println("1- Ürün Ekle");
            System.out.println("2- Ürün Güncelle");
            System.out.println("3- Ürün Sil");
            System.out.println("4- Ürün Listesi");
            System.out.println("5- Ana Menüye Dön");
            System.out.println("6- Çıkış");
            System.out.println("-----------------------------------------------------");
            System.out.println("Sayı Giriniz...");
            int secim = input.nextInt();

            if (secim == 1) {
                // Ürün Ekleme
                input.nextLine(); // Boş satırı temizle
                System.out.println("Ürün Ekleme Sayfasına Hoş Geldiniz !");
                System.out.println("Ürün Adı Giriniz:");
                String ad = input.nextLine();
                System.out.println("Fiyat Bilgisini Giriniz:");
                int fiyat = input.nextInt();
                System.out.println("Stok Bilgisini Giriniz:");
                int stok = input.nextInt();

                urunAdlari.add(ad);
                urunFiyatlari.add(fiyat);
                urunStoklari.add(stok);

                System.out.println("Ürün başarıyla eklendi: " + ad);
                anaSayfayaDon();
            } else if (secim == 2) {
                // Ürün Güncelleme
                input.nextLine(); // Boş satırı temizle
                System.out.println("Güncellemek istediğiniz ürünün adını giriniz:");
                String ad = input.nextLine();
                int index = urunAdlari.indexOf(ad);

                if (index != -1) {
                    System.out.println("Yeni fiyatı giriniz:");
                    int yeniFiyat = input.nextInt();
                    System.out.println("Yeni stok miktarını giriniz:");
                    int yeniStok = input.nextInt();

                    urunFiyatlari.set(index, yeniFiyat);
                    urunStoklari.set(index, yeniStok);

                    System.out.println("Ürün başarıyla güncellendi: " + ad);
                } else {
                    System.out.println("Ürün bulunamadı.");
                }
                anaSayfayaDon();
            } else if (secim == 3) {
                // Ürün Silme
                input.nextLine(); // Boş satırı temizle
                System.out.println("Silmek istediğiniz ürünün adını giriniz:");
                String ad = input.nextLine();
                int index = urunAdlari.indexOf(ad);

                if (index != -1) {
                    urunAdlari.remove(index);
                    urunFiyatlari.remove(index);
                    urunStoklari.remove(index);

                    System.out.println("Ürün başarıyla silindi: " + ad);
                } else {
                    System.out.println("Ürün bulunamadı.");
                }
                anaSayfayaDon();
            } else if (secim == 4) {
                // Ürün Listesi
                System.out.println("Ürün Listesi:");
                for (int i = 0; i < urunAdlari.size(); i++) {
                    System.out.println("Ürün Adı: " + urunAdlari.get(i) + ", Fiyat: " + urunFiyatlari.get(i) + ", Stok: " + urunStoklari.get(i));
                }
                anaSayfayaDon();
            } else if (secim == 5) {
                // Ana Menüye Dön
                System.out.println("Ana menüye dönülüyor...");
                continue;
            } else if (secim == 6) {
                // Çıkış
                System.out.println("Çıkış yapılıyor...");
                break;
            } else {
                System.out.println("Geçersiz seçim, tekrar deneyin.");
            }
        }
    }

    public static void anaSayfayaDon() {
        Scanner input = new Scanner(System.in);
        System.out.println("Ana sayfaya dönmek için 5'e basınız.");
        while (true) {
            int secim = input.nextInt();
            if (secim == 5) {
                break;
            } else {
                System.out.println("Geçersiz seçim, tekrar deneyin. Ana sayfaya dönmek için 5'e basınız.");
            }
        }
    }
}
