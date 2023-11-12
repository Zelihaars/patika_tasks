import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("1. sayıyı girin: ");
        int sayi_1= scan.nextInt();
        System.out.print("2. sayıyı girin: ");
        int sayi_2= scan.nextInt();
        int buyukSayi,kucukSayi;

        if (sayi_1>sayi_2){
            buyukSayi=sayi_1;
            kucukSayi=sayi_2;
        }else {
            buyukSayi=sayi_2;
            kucukSayi=sayi_1;
        }

        int ebob=1;

        for(int k =kucukSayi;k>=1;k--){
            if(kucukSayi%k==0&&buyukSayi%k==0){
                ebob=k;
                System.out.println("Ebob: "+ ebob + " ");
                break;
            }
        }

        for(int i = 1; i <= (kucukSayi*buyukSayi); i++){
            if(i % kucukSayi == 0 && i % buyukSayi == 0){
                System.out.println("Ekok: "+ i + " ");
                break;
            }
        }



    }
}