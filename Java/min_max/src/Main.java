import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Kaç sayı gireceksiniz? ");
        int n = scanner.nextInt();

        System.out.print("1. Sayıyı girin: ");
        int number = scanner.nextInt();
        int min = number;
        int max = number;

        for (int i = 2; i <= n; i++) {
            System.out.print(i + ". Sayıyı girin: ");
            number = scanner.nextInt();

            if (number < min) {
                min = number;
            }

            if (number > max) {
                max = number;
            }
        }

        System.out.println("En küçük sayı: " + min);
        System.out.println("En büyük sayı: " + max);

    }
}
