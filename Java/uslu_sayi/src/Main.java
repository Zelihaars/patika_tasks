import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int as,us;
        Scanner scan = new Scanner(System.in);
        System.out.print("Üssü alınacak sayıyı girin: ");
        as=scan.nextInt();

        System.out.print("Üs olacak sayıyı girin: ");
        us=scan.nextInt();

        int sonuc=1;
        for(int i =1;i<=us;i++){
            sonuc*=as;
        }
        System.out.print("Sonuç : " + sonuc);
    }
}