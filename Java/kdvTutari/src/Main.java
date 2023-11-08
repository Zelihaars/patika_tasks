import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double tutar, kdvOran=0.18;

        Scanner scan=new Scanner(System.in);
        System.out.printf("Ücreti girin: ");

        tutar = scan.nextDouble();
        if (tutar>=1000){
            kdvOran=0.08;
        }

        double kdv=tutar*kdvOran;

        double toplam=tutar+kdv;
        System.out.println(toplam);


    }
}