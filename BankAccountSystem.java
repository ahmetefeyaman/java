import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Hesap h1 = new Hesap("Efe Yaman",1000);

        int secenek;


        while (true){
        System.out.println("Hesap bilgisi icin 1'i\nPara yatırmak icin 2'yi\nPara cekmek icin 3'u tuslayiniz"+"\nCikis yapmak icin 4'u tuslayiniz.");
        secenek = scanner.nextInt();
        
        switch (secenek) {
            case 1:
            h1.hesapBilgisi();
             break;
            case 2:
                h1.paraYatir();
                break;
            case 3:
                h1.paraCekme();
                break;
            case 4:
                System.out.println("Cikis Yapiliyor");
                 return;
            default: System.out.println("Gecersiz islem");
        }
}
    }
}

import java.util.Scanner;

public class Hesap {
    Scanner scanner = new Scanner(System.in);
    String adSoyad;
    double bakiye;
    double miktar;

    public Hesap(String adSoyad,double bakiye){
        this.adSoyad=adSoyad;
        this.bakiye=bakiye;
    }

    public void paraYatir(){
        System.out.println("Miktar giriniz");
        miktar = scanner.nextInt();
        bakiye+=miktar;
        System.out.println("İslem Basarili Yeni Bakiyeniz: "+bakiye);
    }
    public void paraCekme(){
        System.out.println("Miktar giriniz");
        miktar = scanner.nextInt();
        if(bakiye<miktar){
            System.out.println("Yetersiz Bakiye");
        }
        else{
            bakiye-=miktar;
            System.out.println("İslem Basarili Yeni bakiye: "+bakiye);
        }

    }
    public void hesapBilgisi(){
        System.out.println("Isim: "+adSoyad+"\nBakiye: "+bakiye);
    }


}

