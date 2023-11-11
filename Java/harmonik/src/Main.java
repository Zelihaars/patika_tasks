import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Sayı girin: ");
        int sayi=scan.nextInt();

        System.out.print("(1)");
        double result=0;
        for(int i=2;i<=sayi;i++){
            System.out.print(" + (1/"+ i +")" );
            result+=(1.0/i);
        }
        result=result+1;
        System.out.println(" = Sonuç: "+ result );
    }
}