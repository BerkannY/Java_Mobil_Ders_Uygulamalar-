import java.util.Scanner;

public class Diziornek {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Dizi eleman sayısını girin: ");

        int n = input.nextInt(); // Kullanıcıdan eleman sayısını al
        input.nextLine(); // NextInt sonrasında gelen newline karakterini tüketmek için

        String[] eleman = new String[n]; // Kullanıcı tarafından belirlenen boyutta dizi oluştur

        // Kullanıcıdan dizi elemanlarını al
        for (int i = 0; i < n; i++) {
            System.out.print("Dizinin " + (i + 1) + ". elemanını girin: ");
            eleman[i] = input.nextLine();
        }

        // Eleman sayısına göre değerlendirme
        if (n >= 1 && n <= 10) {
            System.out.println("Eleman sayısı az");
        } else if (n > 10 && n <= 20) {
            System.out.println("Eleman sayısı tam");
        } else if (n > 20 && n <= 30) {
            System.out.println("Eleman sayısı fazla");
        } else {
            System.out.println("Geçersiz eleman sayısı");
        }

        input.close(); // Scanner nesnesini kapatma
    }
}
