public class DenemeSwitch {
    public static void main(String[] args) {

      /*  int a = 2;
        switch (a) {
            case 1:
                System.out.println("a =1'dir.");
                break;
            case 2:
                System.out.println("a=2'dir .");
                break;
            default:
                System.out.println("a sayısı 1 veya 2 den farklıdır");
                break;

       */
        int day = 8;

        switch (day) {
            case 1:
                System.out.println("Pazartesi");
                break;
            case 2:
                System.out.println("Salı");
                break;
            case 3:
                System.out.println("Çarşamba");
                break;
            case 4:
                System.out.println("Perşembe");
                break;
            case 5:
                System.out.println("Cuma");
                break;
            case 6:
                System.out.println("Cumartesi");
                break;
            case 7:
                System.out.println("Pazar");
                break;
            default:
                System.out.println("Bir Haftada 7 Gün vardır !(7 Günden Fazla Girdiniz!)");
                break;

        }
    }
}
