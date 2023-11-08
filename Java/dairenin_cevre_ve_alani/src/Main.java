import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       int r;
       double pi=3.14;
       
       Scanner scan=new Scanner(System.in);
       System.out.print("Yarıçap giriniz: ");
       r=scan.nextInt();
       double alan=pi*r*r;
       double cevre=2*pi*r;

       System.out.println("Alan: " +alan);
       System.out.println("Çevre: "+cevre );

    }
}