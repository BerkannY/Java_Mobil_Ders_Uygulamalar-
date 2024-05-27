import java.util.Scanner;

public class Uygulama {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir sayı girin: ");
        int say1 = scanner.nextInt();


        if (say1 < 0) {
            say1 = -say1;
        }

        if (say1 == 0) {
            System.out.println("Girilen sayının basamak sayısı: 1");
        } else {
            int basamakSayisi = 0;
            while (say1 > 0) {
                say1 /= 10;
                basamakSayisi++;
            }
            System.out.println("Girilen sayının basamak sayısı: " + basamakSayisi);
        }



    }
}