import java.util.Scanner;

public class main {
    public static void main(String[] args){
       Scanner scanner = new Scanner(System.in);

       String AhmetKullanici= "Ahmet57";
       String AhmetSifre= "ahm34";
       String EfeKullanici= "Efe5734";
       String EfeSifre= "efe1907";

       String islemler= "(\"Yapmak istediginiz islemi seciniz\" +\n" +
               "               \"1-Bakiye Ogrenme\" +\n" +
               "               \"2-Para Cekme\" +\n" +
               "               \"3-Hesaba para yatırma\" +\n" +
               "               \"4-Cikis\")";

        System.out.println("ATM ye hosgeldiniz");
         System.out.println("Kullanici isminizi ardindan sifrenizi giriniz");
          String kullaniciAdi= scanner.nextLine();
          String sifre= scanner.nextLine();
           if(AhmetKullanici == kullaniciAdi && AhmetSifre == sifre){
            System.out.println("Ahmet57 hesabina giris yapildi.");
           } else if (EfeKullanici == kullaniciAdi && EfeSifre == sifre) {
              System.out.println("Efe5734 hesabina giris yapildi.");
           }
           else {
            System.out.println("Hatali giris");           }


     double hesap;
       double para;
       System.out.println("Hesap bakiyesini giriniz");
        hesap = scanner.nextDouble();

       System.out.println("Yapmak istediginiz islemi seciniz" +
               "1-Bakiye Ogrenme" +
               "2-Para Cekme" +
               "3-Hesaba para yatırma" +
               "4-Cikis");

        Integer sayi = scanner.nextInt();

        switch (sayi){

         case 1 :
           System.out.println("Bakiyeniz" + hesap);
           break;

         case 2 :
           System.out.println("Cekeceginiz para miktarini giriniz.");
              para = scanner.nextDouble();
              if(para>hesap){
               System.out.println("Yetersiz bakiye!");
              }
              else{
               hesap = (hesap - para);
               System.out.println("Kalan Bakiye:" + hesap);
              }
              break;
         case 3 :
          System.out.println("Yatirmak istediginiz para miktarini giriniz.");
            para = scanner.nextDouble();
            hesap= (hesap + para);
            System.out.println("Yeni bakiye:" + hesap);
            break;



        }



    }
}
