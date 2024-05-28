package com.berkan.deneme3;

import java.util.Arrays;

public class DiziIcindeAramaYapmak {
    public static void main(String[] args) {
        int[] notlar={48,55,70,89,20,90,100};
        int aranan = Arrays.binarySearch(notlar,55);
        if (aranan<0){
            System.out.println("Değer dizinin içerisinide değildir");
        }
        else {
            System.out.println("Aranan değer "+aranan+" . indeksinde yer almaktadır");
        }
    }
}
