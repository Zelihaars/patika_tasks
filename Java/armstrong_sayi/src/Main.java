import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Sayı giriniz: ");
        int sayi=scan.nextInt();
        int tempSayi =sayi;
        int basamak=0;
        int basValue;
        int result=0;
        int basUs;

        //System.out.println(sayi/10);
        while(tempSayi!=0){
            tempSayi=tempSayi/10;
            basamak++;
        }

        tempSayi=sayi;

        while(tempSayi!=0){
            basValue=tempSayi%10;
            basUs=1;
            for(int i=1;i<=basamak;i++){
                basUs*=basValue;
            }
            result+=basUs;
            tempSayi/=10;
        }
        if(sayi==result){
            System.out.println(sayi + " sayısı Armstrong bir sayıdır");
        }else {
            System.out.println(sayi + " sayısı Armstrong bir sayı değildir");

        }

    }
}