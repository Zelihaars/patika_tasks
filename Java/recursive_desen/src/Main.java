import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        int num = scanner.nextInt();
        desen(num);
    }
    public static void desen(int num) {
        System.out.print(num + " ");
        if (num <= 0) {
            return;
        }
        desen(num - 5);
        System.out.print(num + " ");
    }
}
