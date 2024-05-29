package com.berkan.deneme3;

import android.renderscript.ScriptGroup;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListOrnek {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<String> kullanicilar= new ArrayList<>();
        kullanicilar.add("Ahmet");
        kullanicilar.add("Mehmet");
        String isim= input.next();
        kullanicilar.add(isim);

        System.out.println(kullanicilar.get(2));


    }
}
