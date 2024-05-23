public class DenemeIfElse {
    public static void main(String[] args) {

        int day = 3;
        if  (day<=5){
            System.out.println("Hafta İçi");
        }
         else if (day<8){
            System.out.println("Hafta Sonu");
        }
         else{
            System.out.println("Geçersiz gün");
        }
// gün kontrolü

         if (day ==1){
            System.out.println("Pazartesi");
        }
        else if (day==2){
            System.out.println("Salı");
        }
        else if (day==3){
            System.out.println("Çarşamba");
        }
        else if (day==4){
            System.out.println("Perşembe");
        }
        else if (day==5){
            System.out.println("Cuma");
        }
        else if (day==6){
            System.out.println("Cumartesi");
        }
        else if (day==7){
            System.out.println("Pazar");
        }
        else {

            System.out.println("Bir haftada 7 gün vardır 7 den fazla sayı girdiniz!");
        }


    }
}
