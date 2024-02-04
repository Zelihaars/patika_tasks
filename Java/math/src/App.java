import java.util.Scanner;
import java.util.Random;
public class App {
    public static void main(String[] args) throws Exception {
    Random rand = new Random();
    int sayi = rand.nextInt(100);
    System.out.println("Sayı: " + sayi);

    System.out.println("*****************************************");
    System.out.println("Bir sayı tahmin ediniz : ");
    Scanner scanner= new Scanner(System.in);

    int tahmin = scanner.nextInt();
    
    int puan = 100;
    for(int i =1;i<5;i++){
        if(tahmin==sayi){
            System.out.println("Tebrikler " + i + ".denemede doğru tahmin ettiniz, Puanınız : " + puan);
            break;
        }else {
            puan-=20;
            System.out.println("Tahmininiz yanlış tekrar deneyin Puanınız : " + puan);
            System.out.println("*****************************************");
            tahmin = scanner.nextInt();
           if(i==4){
            System.out.println("Tahmin hakkınız bitti, oyuna baştan başlayın Puanınız : " + (puan-20));
           }
        }

        
    }
    


    
    }
}
