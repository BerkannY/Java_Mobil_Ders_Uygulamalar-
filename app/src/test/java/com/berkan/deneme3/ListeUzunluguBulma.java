package com.berkan.deneme3;

import java.util.ArrayList;

public class ListeUzunluguBulma {
    public static void main(String[] args) {
        ArrayList<String>isimler = new ArrayList<>();
        isimler.add("Ahmet");
        isimler.add("Mehmet");
        isimler.add("Atilla");
        //Burda 2 numaralı yanı ATİLLAYI SİLİYORUZ LİSTELER 0 DAN BAŞLAR
        isimler.remove(2);
        System.out.println(isimler.size());


    }
}
