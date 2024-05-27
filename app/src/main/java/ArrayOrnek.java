import java.util.Arrays;
import java.util.Scanner;

public class ArrayOrnek {
    public static void main(String[] args) {
//        int[] notlar={65,78,50,95,80};
//        Arrays.sort(notlar);
//        for (int i =0;i<notlar.length;i++)
//        {
//            System.out.println(notlar[i]);
//        }
        //Kullanıcı tarafından girilen 10 adet öğrenci notunun sıralanışı
        Scanner input = new Scanner(System.in);
        int[] ogrenciNotlari = new int[10];
        for (int i = 0; i < ogrenciNotlari.length; i++) {
            System.out.println((i + 1) + ". Notu Girin");
            ogrenciNotlari[i] = input.nextInt();
        }
        Arrays.sort(ogrenciNotlari);
        for (int j = 1; j < 10; j++) {
            System.out.print(" , " + ogrenciNotlari[j]);
        }

    }
}
