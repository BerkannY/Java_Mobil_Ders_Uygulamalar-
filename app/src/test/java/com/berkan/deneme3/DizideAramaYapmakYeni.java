package com.berkan.deneme3;

public class DizideAramaYapmakYeni {
    public static void main(String[] args) {

        boolean varyok=false;
        int[]notlar ={45,65,65,98,75,12,97};
        for (int i = 0;i<notlar.length;i++){
            if (10==notlar[i]){
                varyok=true;
                break;
            }
        }
        if (varyok==true){
            System.out.println("Dizide var");
        }
        else {
            System.out.println("Dizide yok");
        }
    }
}
