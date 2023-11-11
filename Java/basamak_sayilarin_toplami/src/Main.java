import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Sayı gitin: ");
        int number=scan.nextInt();
        int basamak=0;
        int toplam=0;

        while(number!=0){
            basamak=number%10;
            number/=10;
            System.out.println(basamak);
            toplam+=basamak;
        }
        System.out.println("Toplam: "+ toplam);
    }
}