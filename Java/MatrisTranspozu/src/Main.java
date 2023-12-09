import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Matris satır sayısını giriniz: ");
        int satirSayisi = scanner.nextInt();

        System.out.print("Matris sütun sayısını giriniz: ");
        int sutunSayisi = scanner.nextInt();

        int[][] matris = new int[satirSayisi][sutunSayisi];

        System.out.println("Matris elemanlarını giriniz:");
        for (int i = 0; i < satirSayisi; i++) {
            for (int j = 0; j < sutunSayisi; j++) {
                System.out.print("[" + i + "][" + j + "]: ");
                matris[i][j] = scanner.nextInt();
            }
        }

        int[][] transpozeMatris = new int[sutunSayisi][satirSayisi];

        for (int i = 0; i < satirSayisi; i++) {
            for (int j = 0; j < sutunSayisi; j++) {
                transpozeMatris[j][i] = matris[i][j];
            }
        }

        System.out.println("Matris:");
        matrisiYazdir(matris);

        System.out.println("Matrisin Transpozu:");
        matrisiYazdir(transpozeMatris);

        scanner.close();
    }

    // Matrisi ekrana yazdırmak için yardımcı metod
    public static void matrisiYazdir(int[][] matris) {
        for (int i = 0; i < matris.length; i++) {
            for (int j = 0; j < matris[0].length; j++) {
                System.out.print(matris[i][j] + " ");
            }
            System.out.println();
        }
    }
}
