import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       double mat,trk,kimya,biyo,fizik;

       Scanner scan=new Scanner(System.in);
       System.out.print("Matamatik ders notunu girin: ");
       mat=scan.nextDouble();


       System.out.print("Türkçe ders notunu girin: ");
       trk=scan.nextDouble();


        System.out.print("Kimya ders notunu girin: ");
        kimya=scan.nextDouble();


        System.out.print("Biyoloji ders notunu girin: ");
        biyo=scan.nextDouble();


        System.out.print("Fizik ders notunu girin: ");
        fizik=scan.nextDouble();

        int sayac=5;

        if(mat<0||mat>100){
            mat=0;
            sayac--;
        }
        if(trk<0||trk>100){
            sayac--;
            trk=0;
        }
        if(kimya<0||kimya>100){
            sayac--;
            kimya=0;
        }
        if(biyo<0||biyo>100){
            sayac--;
            biyo=0;
        }
        if(fizik<0||fizik>100){
            sayac--;
            fizik=0;
        }
        double ortalama=(mat+fizik+kimya+trk+biyo)/sayac;
        System.out.println("Ortalamanız: " + ortalama);

        if(ortalama<=55){
            System.out.print("Kaldınız");
        }else{
            System.out.print("Geçtiniz");
        }

    }
}