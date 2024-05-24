public class CarpimTablosu {
    public static void main(String[] args) {
        /*int a = 1;
        int carp;
        int b = 1;
        int c = 2;
        int d = 3;
        int e = 4;
        for (int i = 0; i <= 10; i++) {
            carp = i * a;
            System.out.println(b + "X" + (i) + "=" + (carp));
        }
        for (int i = 0; i <= 10; i++) {
            carp = i * c;
            System.out.println(c + "X" + (i) + "=" + (carp));

        }
        for (int i = 0; i <= 10; i++) {
            carp = i * d;
            System.out.println(d + "X" + (i) + "=" + (carp));

        }
        for (int i = 0; i <= 10; i++) {
            carp = i * e;
            System.out.println(e + "X" + (i) + "=" + (carp));

        }

         */
        for (int i=1;i<=10;i++){
            for (int j=1; j<=10; j++){
                System.out.print(i+"X"+j+"="+(i*j)+("\t"));
            }
            System.out.println();
        }

    }
}