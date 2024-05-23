import static android.icu.lang.UCharacter.GraphemeClusterBreak.L;

public class DenemeTamSayılar {
    public static void main(String[] args) {
        byte kucuksayi=127;
        short kisasayi =32767;
        int TamSayi=2147483647;
        long uzunSayi = 9223372036854775807L;
        System.out.println("byte :"+kucuksayi);
        System.out.println("kisa sayı :"+kisasayi);
        System.out.println("Tam Sayı :"+TamSayi);
        System.out.println("uzun Sayı :"+uzunSayi);
    }
}
