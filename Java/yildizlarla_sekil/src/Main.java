import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Sayı giriniz: ");
        int sayi=scan.nextInt();

        /* Dersteki örnek
        for (int i = 2; i <= sayi; i++){
            for (int k = 1; k <= (sayi-i); k++){
                System.out.print(" ");
            }
            for(int j = 2; j <= (2*i) - 1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        * */
        for (int i=0 ;i < sayi;i++){

            for (int z=0;z < sayi-i ;z++){
                System.out.print(" ");
            }

            for (int j=1;j <= 2*i;j++){
                System.out.print("*");
            }

            System.out.print("\n");
        }

        for (int i=0 ;i <= sayi;i++){

            for (int z=0;z < i ;z++){
                System.out.print(" ");
            }

            for (int j=1;j <= 2*(sayi-i) ;j++){
                System.out.print("*");
            }

            System.out.print("\n");
        }

    }
}