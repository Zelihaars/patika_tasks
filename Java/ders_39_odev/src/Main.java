import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int sayi;
        Scanner scan = new Scanner(System.in);
      int toplam=0;
      do{
          System.out.print("Sayı giriniz: ");
          sayi=scan.nextInt();
          if(sayi%4==0){
              toplam+=sayi;
          }
      }
      while (sayi%2==0);
      System.out.println("Toplam: " + toplam);
    }
}