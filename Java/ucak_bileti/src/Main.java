import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int km,yas,tip;
        Scanner scan = new Scanner(System.in);

        System.out.print("Kmyi giriniz: " );
        km=scan.nextInt();

        System.out.print("Yaşınızı giriniz: " );
        yas=scan.nextInt();


        System.out.print("Yolculuk tipini giriniz (1 => Tek Yön , 2 => Gidiş Dönüş): " );
        tip=scan.nextInt();

        if (km<=0|| yas<0){
            System.out.println("Hatalı Veri Girdiniz !");
            return;
        }

        double normalTutar=km*0.10;
        if (tip==1){
            if (yas<12){
                double yasindirimi=normalTutar*0.5;
                normalTutar=normalTutar-yasindirimi;
            } else if (yas<24) {
                double yasindirimi=normalTutar*0.1;
                normalTutar=normalTutar-yasindirimi;

            }
        } else if (tip==2){
            if (yas<12){
                double yasIndirimi=normalTutar*0.5;
                double indirimTutarı=normalTutar-yasIndirimi;
                double gidisDonus=indirimTutarı*0.20;
                normalTutar=(indirimTutarı-gidisDonus)*2;
            } else if (yas<24) {
                double yasIndirimi=normalTutar*0.1;
                double indirimTutarı=normalTutar-yasIndirimi;
                double gidisDonus=indirimTutarı*0.20;
                normalTutar=(indirimTutarı-gidisDonus)*2;
            }else{
                System.out.println("Hatalı Veri Girdiniz ! Yalnızca uçuş tipine göre 1 veya 2 değerlerini girin");
            }
        }

        System.out.println("Normal Tutar:  "+ normalTutar);
    }
}