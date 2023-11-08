import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int fizik,mat,kimya,turkce,tarih,muzik;

        Scanner inp = new Scanner(System.in);

        System.out.print("Fizik notunuz: ");
        fizik=inp.nextInt();

        System.out.print("Matematik notunuz: ");
        mat=inp.nextInt();

        System.out.print("Kimya notunuz: ");
        kimya=inp.nextInt();

        System.out.print("Turkce notunuz: ");
        turkce=inp.nextInt();

        System.out.print("Tarih notunuz: ");
        tarih=inp.nextInt();

        System.out.print("Muzik notunuz: ");
        muzik=inp.nextInt();

        int toplam= (fizik+mat+kimya+turkce+tarih+muzik);
        double ort=toplam/6;
        System.out.println("Oratalamanız: " + ort);

        String sonuc=(ort>50)?"Geçti":"Kaldı";
        System.out.println(sonuc);


    }
}