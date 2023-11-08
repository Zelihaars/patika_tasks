import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
     int a,b,c;
        Scanner scan=new Scanner(System.in);
        System.out.println("1.sayıyı girin: ");
        a=scan.nextInt();

        System.out.println("2.sayıyı girin: ");
        b=scan.nextInt();

        System.out.println("3.sayıyı girin: ");
        c=scan.nextInt();

       // 7 3 5
       // a b c

        if((a>b)&&(a>c)){
            if(b>c){
                System.out.println("Sıralama : " + a +" > " + b + " > "+ c);
            }else {
                System.out.println("Sıralama : " + a +" > " + c + " > "+ b);
            }
        } else if ((b>a)&&(b>c)) {
            if(a>c){
                System.out.println("Sıralama : " + b +" > " + a + " > "+ c);
            }else {
                System.out.println("Sıralama : " + b +" > " + c + " > "+ a);
            }
        }else{
            if(a>b){
                System.out.println("Sıralama : " + c +" > " + a + " > "+ b);
            }else {
                System.out.println("Sıralama : " + c +" > " + b + " > "+ a);
            }
        }
    }
}