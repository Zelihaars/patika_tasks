import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Taksimetre Programı");
        int km;
        double perKm=2.20;
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Mesafeyi girin: ");
            km=input.nextInt();
        }
        perKm=perKm*km + 10;
        perKm=perKm<=20?20:perKm;
        System.out.println("Km başına toplam tutar: " + perKm);

    }
}