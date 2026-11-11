import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Arac markasini giriniz");
        String marka = scanner.nextLine();
        System.out.println("Araba gunluk ucretini giriniz");
        double gunlukucret= scanner.nextDouble();
        scanner.nextLine();
        System.out.println("Motosiklet markasini giriniz.");
        String marka2 =scanner.nextLine();
        System.out.println("Gün sayisini giriniz.");
        int gun = scanner.nextInt();

        Arac a1 = new Araba(marka,gunlukucret);
        Arac a2 = new Motosiklet(marka2);

        a1.kiraHesaplama(gun);
        a2.kiraHesaplama(gun);

    }
}

public class Arac{
    String marka;
    double gunlukUcret;

    public Arac(String marka,double gunlukUcret){
        this.marka=marka;
        this.gunlukUcret=gunlukUcret;
    }
    public Arac(String marka){
        this.marka=marka;
        this.gunlukUcret=1000;
    }
    public void kiraHesaplama(int gun){
        gunlukUcret=(gunlukUcret*gun);
        System.out.println("Gunluk ucret :"+gunlukUcret);
    }
}
public class Araba extends Arac{
    public Araba(String marka,double gunlukUcret){
        super(marka,gunlukUcret);
    }
    @Override
    public void kiraHesaplama(int gun){
        gunlukUcret=(gunlukUcret*gun);
        System.out.println(gun+" boyunca "+marka+" marka arabayi kiralama ucreti: "+gunlukUcret);
    }
}
public class Motosiklet extends Arac{
    public Motosiklet(String marka){
        super(marka);
    }
    @Override
    public void kiraHesaplama(int gun){
        gunlukUcret=(gunlukUcret*gun);
        System.out.println(gun+" boyunca "+marka+" marka araci kiralama bedeli: "+gunlukUcret);
    }

}
