import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
      double sayi1,sayi2;
      int islem;
      String topla,cikar,carp,bol;

      Scanner scan = new Scanner(System.in);
      System.out.print("İlk sayıyı giriniz: ");
      sayi1=scan.nextInt();
      System.out.print("İkinci sayıyı giriniz: ");
      sayi2=scan.nextInt();

      System.out.print("Bir işlem seçiniz: ");
      double sonuc=0;
      islem=scan.nextInt();
      switch(islem){
          case 1:
              sonuc=sayi2+sayi1;
              System.out.println("Toplama işlemi " + sonuc);
              break;
          case 2:
              sonuc=sayi2-sayi1;
              System.out.println("Çıkarma işlemi " + sonuc);
              break;
          case 3:
              sonuc=sayi2*sayi1;
              System.out.println("Çarpma işlemi " + sonuc);
              break;
          case 4:
              sonuc=sayi2/sayi1;
              System.out.println("Bölme işlemi " + sonuc);
              break;
          default:
              System.out.println("Yanlış bir işlem seçildi");
      }

    }
}