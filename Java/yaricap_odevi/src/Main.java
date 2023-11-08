import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       int r;
       double pi=3.14, alfa;
       
       Scanner scan=new Scanner(System.in);
       System.out.print("Yarıçap giriniz: ");
       r=scan.nextInt();
       System.out.print("Merkez açısı giriniz: ");
       alfa=scan.nextInt();
       double alan=((pi * (r*r) * alfa) / 360);

       System.out.println("Alan: " +alan);

    }
}