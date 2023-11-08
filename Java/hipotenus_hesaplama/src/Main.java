import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.printf("Hipotenüs Hesaplama");
       int kenar1,kenar2;
       double hipotenus;
        Scanner scan=new Scanner(System.in);
        System.out.print("1. kenarı giriniz : ");
        kenar1=scan.nextInt();
        System.out.print("2. kenarı giriniz : ");
        kenar2=scan.nextInt();
        hipotenus=Math.sqrt((kenar1*kenar1+kenar2*kenar2));

        System.out.printf("Hipotenüs "+ hipotenus);

    }
}