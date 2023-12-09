import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Verilen dizi
        int[] dizi = {10, 20, 20, 10, 10, 20, 5, 20};

        int[] list = new int[dizi.length];
        int[] duplicate = new int[dizi.length];

        int elemanSayisi = 0;

        for (int i = 0; i < dizi.length; i++) {
            int eleman = dizi[i];
            boolean isFind = false;

            for (int j = 0; j < elemanSayisi; j++) {
                if (list[j] == eleman) {
                    duplicate[j]++;
                    isFind = true;
                    break;
                }
            }

            if (!isFind) {
                list[elemanSayisi] = eleman;
                duplicate[elemanSayisi] = 1;
                elemanSayisi++;
            }
        }
        System.out.println("Dizi : " + Arrays.toString(dizi));
        System.out.println("Tekrar Sayıları ");

        // Frekansları ekrana yazdıralım
        for (int i = 0; i < elemanSayisi; i++) {
            System.out.println(list[i] + " sayısı " + duplicate[i] + " kere tekrar edildi.");
        }
    }
}