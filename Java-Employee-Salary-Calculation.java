import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

         System.out.println("Muhendisin Adini giriniz");
         String ad = scanner.nextLine();
         System.out.println("Mudurun adini giriniz");
         String ad1= scanner.nextLine();
         System.out.println("Baslangic maasini giriniz");
         double maas = scanner.nextDouble();

         Personel p1 = new Mühendis(ad, maas);
         Personel p2 = new Müdür(ad1,maas);
         p1.MaasHesapla();
         p2.MaasHesapla();

    }
}
public class Personel {

    String ad;
    double maas;

    public Personel(String ad,double maas){
        this.ad=ad;
        this.maas=maas;
    }
    public void MaasHesapla(){
        maas=0;
        System.out.println("Baslangic maasi: "+maas);
    }

}

public class Mühendis extends Personel{

    public Mühendis(String ad,double maas){
        super(ad,maas);
    }
    @Override
    public void MaasHesapla(){
        maas=maas*1.3;
        System.out.println("Muhendis "+ad+" Beyin Maasi: "+maas);
    }
}
public class Müdür extends Personel{

    public Müdür(String ad,double maas){
        super(ad,maas);
    }
    @Override
    public void MaasHesapla(){
        maas=maas*1.5;
        System.out.println("Müdür "+ad+" Beyin Maasi: "+maas);
    }
}
