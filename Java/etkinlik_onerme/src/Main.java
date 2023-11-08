import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
      int hava;
      Scanner scan =new Scanner(System.in);
      System.out.println("Hava derecesini giriniz");
      hava=scan.nextInt();

      if(hava<=5){
          System.out.println("Kayak etkinliği yapabilirsiniz");
      } else if(hava<=15) {
          System.out.println("Sinema etkinliği yapabilirsiniz");
      }else if(hava<=25) {
          System.out.println("Piknik etkinliği yapabilirsiniz");
      }else if(hava>25) {
          System.out.println("Yüzme etkinliği yapabilirsiniz");
      }else{
          System.out.println("Tanımsız derece girdiniz");

      }
    }
}