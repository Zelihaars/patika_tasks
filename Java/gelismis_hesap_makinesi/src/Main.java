import java.util.Scanner;

public class Main {
    static int plus(int a, int b) {
        System.out.println("Toplamları: "+ (a+b));
        return a+b;
    }

    static int minus(int a, int b) {
        System.out.println("Farkları: "+ (a-b));
        return a-b;
    }

    static int times(int a, int b) {
        System.out.println("Çarpımları: "+ (a*b));
        return a*b;
    }

    static int divided(int a, int b) {
        System.out.println("Bölümleri: "+ (a/b));
        return a/b;
    }

    static int power(int a, int b) {
        int sonuc=1;
        for(int i =1;i<=b;i++){
            sonuc*=a;
        }
        System.out.println(sonuc);
        return sonuc;
    }

    static int factorial(int a) {
        int sonuc=1;
        for (int i =1;i<=a;i++){
            sonuc*=i;
        }
        System.out.println(sonuc);
        return sonuc;
    }

    static  int mod(int a , int b){
        System.out.println("Modu: "+ (a%b));
        return a%b;
    }

    static void calc(int a ,int b){
        System.out.println("Çevresi : "+(2*(a+b)));
        System.out.println("Alanı: "+ (a*b) );
    }
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int select;

        String menu=
                "\n*****************************************\n"
                +  "1- Toplama işlemi\n"
                + "2- Çıkarma İşlemi\n"
                + "3- Çarpma İşlemi\n"
                + "4- Bölme işlemi\n"
                + "5- Üslü Sayı Hesaplama\n"
                + "6- Faktoriyel Hesaplama\n"
                + "7- Mod Alma\n"
                + "8- Dikdörtgen Alan ve Çevre Hesabı\n"
                + "0- Çıkış Yap\n"
                + "*****************************************\n" ;

        while (true){
            System.out.println(menu);
            System.out.print("Yapmak istediğiniz işlemi seçin: ");
            select=scan.nextInt();
            if(select==0){
                break;
            }
            System.out.print("1.sayıyı girin: ");
            int a=scan.nextInt();
            System.out.print("2.sayıyı girin: ");
            int b=scan.nextInt();
            switch (select) {
                case 1:
                    plus(a,b);
                    break;
                case 2:
                    minus(a,b);
                    break;
                case 3:
                    times(a,b);
                    break;
                case 4:
                    divided(a,b);
                    break;
                case 5:
                    power(a,b);
                    break;
                case 6:
                    factorial(a);
                    break;
                case 7:
                    mod(a,b);
                    break;
                case 8:
                    calc(a,b);
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Yanlış bir değer girdiniz, tekrar deneyiniz.");
            }
        }



    }
}