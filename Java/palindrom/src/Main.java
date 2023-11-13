import java.util.Scanner;

public class Main {
    static boolean isPalindrom(int a){
        int temp=a,reverse=0,last;
        while (temp!=0){
            last=temp%10;
            reverse=(reverse*10)+last;
            temp /=10;
        }
        if (a==reverse) return true;
        else return false;

    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Sayı girin: ");
        int a=scan.nextInt();

        boolean sonuc=isPalindrom(a);

        if (sonuc){
            System.out.println("Palindromdur");
        }else {
            System.out.println("Palindrom değildir");
        }

    }
}