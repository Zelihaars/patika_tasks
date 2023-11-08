import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double boy,kitle,kilo;
        Scanner scan=new Scanner(System.in);
        System.out.print("Lütfen boyunuzu (metre cinsinde) giriniz :");
        boy=scan.nextFloat();

        System.out.print("Lütfen kilonuzu giriniz: ");
        kilo=scan.nextInt();

        kitle=((kilo/boy)*(boy));

        System.out.print("Vücut Kitle İndeksiniz : "+ kitle);

    
    }
}