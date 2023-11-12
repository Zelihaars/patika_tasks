import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Fibonacci serisinin eleman sayısını girin: ");
        int n = scanner.nextInt();

        int ilk = 0;
        int temp1 = 1;
        int temp2 = 0;

        for (int i = 0; i < n; i++) {
            System.out.print(ilk + " ");

            ilk = temp1 + temp2;
            temp2 = temp1;
            temp1 = ilk;
        }

        scanner.close();
    }
}
