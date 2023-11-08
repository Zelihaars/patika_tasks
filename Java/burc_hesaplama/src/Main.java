import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int day, month;

        System.out.print("Lutfen Doğum Gününüzü Giriniz: ");
        day = input.nextInt();

        System.out.print("Lutfen Doğum Ayınızı (1-12 arasında) Giriniz: ");
        month = input.nextInt();

        if (month >= 1 && month <= 12)
        {
            if(month==1)
            {
                if(day>=1 && day<=31)
                {
                    if(day<=22)
                    {
                        System.out.print("Oğlak burcusunuz.");
                    }
                    else
                    {
                        System.out.print("Kova burcusunuz.");
                    }
                }
                else
                {
                    System.out.print("Geçersiz bir gün grdiniz.");
                }
            }
            if(month==2)
            {
                if(day>=1 && day<=31)
                {
                    if(day<=20)
                    {
                        System.out.print("Kova burcusunuz.");
                    }
                    else
                    {
                        System.out.print("Balık burcusunuz.");
                    }
                }
                else
                {
                    System.out.print("Geçersiz bir gün grdiniz.");
                }
            }
            if(month==3)
            {
                if(day>=1 && day<=31)
                {
                    if(day<=21)
                    {
                        System.out.print("Balık burcusunuz.");
                    }
                    else
                    {
                        System.out.print("Koç burcusunuz.");
                    }
                }
                else
                {
                    System.out.print("Geçersiz bir gün grdiniz.");
                }
            }
            if(month==4)
            {
                if(day>=1 && day<=30)
                {
                    if(day<=20)
                    {
                        System.out.print("Koç burcusunuz.");
                    }
                    else
                    {
                        System.out.print("Boğa burcusunuz.");
                    }
                }
                else
                {
                    System.out.print("Geçersiz bir gün grdiniz.");
                }
            }
            if(month==5)
            {
                if(day>=1 && day<=31)
                {
                    if(day<=21)
                    {
                        System.out.print("Boğa burcusunuz.");
                    }
                    else
                    {
                        System.out.print("İkizler burcusunuz.");
                    }
                }
                else
                {
                    System.out.print("Geçersiz bir gün grdiniz.");
                }
            }
            if(month==6)
            {
                if(day>=1 && day<=30)
                {
                    if(day<=22)
                    {
                        System.out.print("İkizler burcusunuz.");
                    }
                    else
                    {
                        System.out.print("Yengeç burcusunuz.");
                    }
                }
                else
                {
                    System.out.print("Geçersiz bir gün grdiniz.");
                }
            }
            if(month==7)
            {
                if(day>=1 && day<=31)
                {
                    if(day<=22)
                    {
                        System.out.print("Yengeç burcusunuz.");
                    }
                    else
                    {
                        System.out.print("Aslan burcusunuz.");
                    }
                }
                else
                {
                    System.out.print("Geçersiz bir gün grdiniz.");
                }
            }
            if(month==8)
            {
                if(day>=1 && day<=31)
                {
                    if(day<=22)
                    {
                        System.out.print("Aslan burcusunuz.");
                    }
                    else
                    {
                        System.out.print("Başak burcusunuz.");
                    }
                }
                else
                {
                    System.out.print("Geçersiz bir gün grdiniz.");
                }
            }
            if(month==9)
            {
                if(day>=1 && day<=30)
                {
                    if(day<=22)
                    {
                        System.out.print("Başak burcusunuz.");
                    }
                    else
                    {
                        System.out.print("Terazi burcusunuz.");
                    }
                }
                else
                {
                    System.out.print("Geçersiz bir gün grdiniz.");
                }
            }
            if(month==10)
            {
                if(day>=1 && day<=31)
                {
                    if(day<=22)
                    {
                        System.out.print("Terazi burcusunuz.");
                    }
                    else
                    {
                        System.out.print("Akrep burcusunuz.");
                    }
                }
                else
                {
                    System.out.print("Geçersiz bir gün grdiniz.");
                }
            }
            if(month==11)
            {
                if(day>=1 && day<=30)
                {
                    if(day<=21)
                    {
                        System.out.print("Akrep burcusunuz.");
                    }
                    else
                    {
                        System.out.print("Yay burcusunuz.");
                    }
                }
                else
                {
                    System.out.print("Geçersiz bir gün grdiniz.");
                }
            }
            if(month==12)
            {
                if(day>=1 && day<=31)
                {
                    if(day<=21)
                    {
                        System.out.print("Yay burcusunuz.");
                    }
                    else
                    {
                        System.out.print("Oğlak burcusunuz.");
                    }
                }
            }
        }
        else
        {
            System.out.println("Geçersiz bir ay girdiniz.");
        }

    }

}