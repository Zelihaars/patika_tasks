import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
      double armut, armutKg=2.14;
      double elma, elmaKg=3.67;
      double domates, domatesKg=1.11;
      double muz, muzKg=0.95;
      double patlican, patlicanKg=5.00;
      Scanner scan = new Scanner(System.in);
      
      System.out.print("Armut kaç kilo ? : ");
      armut=scan.nextInt();
      armutKg=armutKg*armut;

      System.out.print("Elma kaç kilo ? : ");
      elma=scan.nextInt();
      elmaKg=elmaKg*elma;
    

      System.out.print("Domates kaç kilo ? : ");
      domates=scan.nextInt();
      domatesKg=domatesKg*domates;

      System.out.print("Muz kaç kilo ? : ");
      muz=scan.nextInt();
      muzKg=muzKg*muz;

      System.out.print("Patlıcan kaç kilo ? : ");
      patlican=scan.nextInt();
      patlicanKg=patlicanKg*patlican;

      double toplam=armutKg+elmaKg+domatesKg+muzKg+patlicanKg;

      System.out.print("Toplam Tutar: "+toplam);
      
    
    
    }
}