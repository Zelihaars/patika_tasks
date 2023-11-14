import java.util.Scanner;

public class Main {
    static int us(int a,int b){
        if (b == 0) {
            return 1;
        } else {
            return a * us(a, b-1);
        }
    }
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        System.out.print("Taban değeri giriniz: ");
        int taban=scan.nextInt();
        System.out.print("Üs değeri giriniz: ");
        int us=scan.nextInt();

        int sonuc = us(taban, us);
        System.out.println(taban + "^" + us + " = " + sonuc);
    }
}