import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int eleman=0;
        int start=0;

        Scanner scan=new Scanner(System.in);
        System.out.print("Dizinin boyutunu giriniz n : ");
        int boyut=scan.nextInt();
        int[]dizi = new int[boyut];
        System.out.println("Dizinin elemanlarını giriniz :");
        for (int i =0;i<boyut;i++){
            System.out.print(i+1 + ". Elemanı : ");
            eleman=scan.nextInt();
            dizi[start++]=eleman;
                   }

        System.out.print("Dizi elemanları : ");
        for (int value : dizi){
            System.out.print(" " + value);
        }
        System.out.println();

        Arrays.sort(dizi);
        System.out.print("Sıralama : " + Arrays.toString(dizi) );


    }

}