import java.util.Scanner;
public class OrnekForIcınde {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.println("Sayıyı giriniz");
            int say1 = input.nextInt();
            int sonuc1 = 0;
            for (int i = 0; i <= say1; i++) {
                sonuc1 = i % 3;
            }

                if (sonuc1 == 0) {

                System.out.println(sonuc1);
                }

                else if (sonuc1 != 0) {

                System.out.println("Yeniden Deneyin");
                }



        }
    }
