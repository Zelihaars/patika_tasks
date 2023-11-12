import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);
        System.out.print("Sayı giriniz: ");
        int sayi=scan.nextInt();



        for (int i = sayi; i >= 1; i--) {
            for (int j = 1; j <= (2 * i) - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

}