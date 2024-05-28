package com.berkan.deneme3;

import java.util.Scanner;

public class While {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("1 Sayı giriniz!");
//        int say1= input.nextInt();
//        int faktoriyel=1;
//        int i =1;
//        while (i<=say1){
//            faktoriyel*=i;
//            i++;
//        }
//        System.out.println("Sayının Faktoriyeli= "+faktoriyel);
        int say1= input.nextInt();
        while (say1>=1){
            System.out.println(say1);
            say1-=2;

        }

    }
}
