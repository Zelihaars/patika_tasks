import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String kullaniciadi;
        String sifre;
        String r;

        Scanner scan = new Scanner(System.in);
        System.out.print("Kullanıcı adınız : ");
        kullaniciadi=scan.nextLine();

        System.out.print("Şifreniz : ");
        sifre=scan.nextLine();

        if(kullaniciadi.equals("Zeliha") && sifre.equals("12345")){
            System.out.println("Giriş başarılı");
        }else {
            System.out.println("Kullanıcı adı veya şifre hatalı");
            System.out.println("Şifrenizi sıfırlamak isterseniz r ye basınız");
            String islem=scan.nextLine();
            switch(islem){
                case "r":
                    String yenisifre;
                    System.out.println("Eski şifreyi girin");
                    sifre=scan.nextLine();
                    if(sifre.equals("12345")){
                        System.out.println("Yeni şifreyi girin");
                        yenisifre=scan.nextLine();
                        if(sifre.equals(yenisifre)){
                            System.out.println("Yeni şifreniz eskisi ile aynı olamaz");
                        }else{
                            sifre=yenisifre;
                            System.out.println("Şifre sıfırlandı");

                        }

                    }else {
                        System.out.println("Şifre hatalı");

                    }


                    break;
                default:
                    System.out.println("..");
            }
        }
    }
}