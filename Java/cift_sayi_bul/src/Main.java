import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int k;
        Scanner scan=new Scanner(System.in);
        System.out.print("Sayı giriniz: ");
        k=scan.nextInt();
        int toplam=0;
        int sayac=0;
        for(int i=1;i<=k;i++){
            if(i%3==0&& i%4==0){
                toplam+=i;
                System.out.print(i + " ");
                sayac++;
            }
        }
        int ortalama=toplam/sayac;
        System.out.println("\nOrtalama: " + ortalama);

    }
}