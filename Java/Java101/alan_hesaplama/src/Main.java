import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.printf("Üçgen Alanını Hesaplama \n");
        int kenar1,kenar2,kenar3;
        double alan,u,cevre;
        Scanner scan=new Scanner(System.in);
        System.out.print("1. kenarı giriniz : ");
        kenar1=scan.nextInt();
        System.out.print("2. kenarı giriniz : ");
        kenar2=scan.nextInt();
        System.out.print("3. kenarı giriniz : ");
        kenar3=scan.nextInt();

        u=(kenar1+kenar2+kenar3)/2;
        alan=Math.sqrt((u)*(u-kenar1)*(u-kenar2)*(u-kenar3));
        cevre=2*u;

        System.out.printf("Alan "+ alan);
        System.out.printf("\nÇevre "+ cevre);

    }
}