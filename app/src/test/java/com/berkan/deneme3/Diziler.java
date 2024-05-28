package com.berkan.deneme3;

import java.util.Scanner;

public class Diziler {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        int[] ogrenciNo = new int[10];
        String[] ogrenciAdi=new String[10];
        for (int i=0; i<10;i++)
        {
            System.out.println(i+". Öğrenci Numarası Girin");
            ogrenciNo[i]=input.nextInt();
            System.out.println(i+". Öğrenci adını giriniz");
            ogrenciAdi[i]=input.next();
        }



    }


    }


