import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       int dogumYili;
       Scanner scan = new Scanner(System.in);
       System.out.print("Doğum yılınızı girin : ");
       dogumYili=scan.nextInt();

       int sonuc=dogumYili%12;
       System.out.print("Çin Zodyağı Burcunuz: ");
       switch (sonuc){
           case 0:
               System.out.println("Maymun Burcu");
               break;
           case 1:
               System.out.println("Horoz Burcu");
               break;
           case 2:
               System.out.println("Köpek Burcu");
               break;
           case 3:
               System.out.println("Domuz Burcu");
               break;
           case 4:
               System.out.println("Fare Burcu");
               break;
           case 5:
               System.out.println("Öküz Burcu");
               break;
           case 6:
               System.out.println("Kaplan Burcu");
               break;
           case 7:
               System.out.println("Tavşan Burcu");
               break;
           case 8:
               System.out.println("Edjerha Burcu");
               break;
           case 9:
               System.out.println("Yılan Burcu");
               break;
           case 10:
               System.out.println("At Burcu");
               break;
           case 11:
               System.out.println("Koyan Burcu");
               break;
           default:
               System.out.println("Burcunuz hesaplanamadı");

       }

    }
}