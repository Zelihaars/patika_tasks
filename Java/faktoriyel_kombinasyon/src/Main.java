import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Kombinasyon Hesaplayan Program");
        Scanner input =new Scanner(System.in);

        int n, r, kombinasyon, factoriyal1=1, factoriyal2=1, factoriyal3=1;
        System.out.print("n elemanını giriniz: ");
        n = input.nextInt();

        System.out.print("r elemanını giriniz: ");
        r = input.nextInt();

        for(int i=1; i<=n; i++)
        {
            factoriyal1 *=i;
        }
        for(int i=1; i<=r; i++)
        {
            factoriyal2 *=i;
        }
        for(int i=1; i<=(n-r); i++)
        {
            factoriyal3 *=i;
        }
        kombinasyon= factoriyal1 / (factoriyal2 * factoriyal3);


        System.out.println("Kombinasyonu C(n,r): "+ kombinasyon);

    }
}