import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        int num = scanner.nextInt();
        if (isAsal(num, num / 2)) {
            System.out.println(num + " sayısı ASALDIR !.");
        } else {
            System.out.println(num + "sayısı ASAL değildir !.");
        }
    }

    public static boolean isAsal(int num, int div) {
        if (div == 1) {
            return true;
        } else {
            if (num % div == 0) {
                return false;
            } else {
                return isAsal(num, div - 1);
            }
        }
    }
}
