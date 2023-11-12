import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String userName,password;
        int right=3;
        int balance=1500;

        while (right>0){
            System.out.println("Kullanıcı adı girin: ");
            userName=scan.nextLine();
            System.out.println("Şifre  girin: ");
            password=scan.nextLine();

            if(userName.equals("Admin")&&(password.equals("12345"))){
                System.out.println("Giriş başarılı, X bankasına hoş geldiniz");
                System.out.println(
                        "1 - Para yatırma\n" +
                        "2 - Para Çekme\n" +
                        "3 - Bakiye Sorgula\n" +
                        "4 - Çıkış Yap");
                System.out.print("Yapmak istediğiniz işlemi seçin: ");
                int secim=scan.nextInt();
                int para;
                switch (secim){
                    case 1:
                        System.out.print("Yatırmak istediğiniz miktarı girin: ");
                        para=scan.nextInt();
                        balance=balance+para;
                        System.out.println("Para yatırıldı: "+ balance);
                        continue;
                    case 2:
                        System.out.print("Çekmek istediğiniz miktarı girin: ");
                        para=scan.nextInt();
                        balance=balance-para;
                        System.out.println("Para çekildi: "+ balance);
                        continue;
                    case 3:
                        System.out.println("Bakiyeniz: " + balance);
                        continue;
                    case 4:
                        System.out.println("Çıkış yapıldı");
                        continue;
                    default:
                        System.out.println("Hatalı işlem seçildi");

                }
            }else {
                right--;
                System.out.println("Kullanıcı adı veya parola hatalı");
                if (right==0){
                    System.out.println("Hesabınız bloke olmuştur ");
                }else {
                    System.out.println("Tekrar deneyiniz - kalan hak: "+ right);

                }

            }

        }

    }
}