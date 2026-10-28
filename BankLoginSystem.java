import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int giris;
        String sifrebelirlenen;
        String isim;
        String sifreGiris;

          System.out.println("BANKAMIZA HOSGELDİNİZ\n-----------------------------\n");
          System.out.println("Kaydolmak icin 1'i \nGiris yapmak icin 2'yi tuslayiniz");
           giris= scanner.nextInt();
           scanner.nextLine();
             switch (giris){
                 case 1:
                      System.out.println("Adinizi ve Soyadinizi giriniz.");
                        isim = scanner.nextLine();
                      System.out.println("Sifrenizi belirleyiniz");
                        sifrebelirlenen = scanner.nextLine();
                      System.out.println("Kaydiniz olusturulmustur.\nGiris kapisina yönlendiriliyosunuz...\nHosgeldiniz Sayin "+isim);
                      System.out.println("Sisteme giris yapmak icin sifrenizi giriniz");
                        sifreGiris = scanner.nextLine();
                         login(sifrebelirlenen,sifreGiris);
                          break;
                 case 2:
                    sifrebelirlenen = "Yaman_57";
                    isim = "Ahmet Efe Yaman";
                     System.out.println("Hosgeldiniz Sayin " + isim +"\nSisteme giris yapmak icin sifrenizi giriniz");
                       sifreGiris = scanner.nextLine();
                        login(sifrebelirlenen,sifreGiris);
                         break;
                 default:
                     System.out.println("Hatali giris!");

             }


    }
     public static void login(String sifreBelirlenmis , String sifreGirisKontrolu) {
        Scanner scanner = new Scanner(System.in);
         int girishakki = 3;
         boolean aktif = true;
             for (int i = 0; i < 3; i++) {
                 if (sifreGirisKontrolu.equals(sifreBelirlenmis)) {
                     System.out.println("Basariyla Giris Yapildi!");
                      break;
                 }
                 else {
                     System.out.println("Sifre Hatali Kontrol Ediniz...\n\nTekrar deneyiniz.");
                        girishakki--;
                     if (girishakki == 0) {
                        aktif = false ;
                         break;
                     }
                       sifreGirisKontrolu=scanner.nextLine();
                 }
             }
         if(aktif==false){
             System.out.println("Hesabiniza 5 dakikaligina erisim engeli getirildi!!!\nDaha sonra tekrar deneyiniz.");
         }
     }
}
