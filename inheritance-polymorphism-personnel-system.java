import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Personel p1 = new Doktor();
        Personel p2 = new Hemsire();

        p1.adSoyad = "Efe Yaman";
        p1.departman = "Departman101";
        p1.maas = 245000;

        System.out.println("Ad: "+p1.adSoyad+"\nDepartman: "+p1.departman);

        p1.calis();
        p1.maasGoster();

        p2.adSoyad="Onur Ozkan";
        p2.departman="Departman 303";
        p2.maas=102500;

        System.out.println("Ad: "+p2.adSoyad+"\nDepartman: "+p2.departman);

        p2.calis();
        p2.maasGoster();
    }
}


public class Personel {
    String adSoyad;
    String departman;
    int maas;

    public void calis(){
        System.out.println("Personel calisiyor");
    }
    public void maasGoster(){
        System.out.println("Maas :");
    }

}

public class Doktor extends Personel{
    @Override
    public void calis(){
        System.out.println("Doktor hasta muayene ediyor");
    }
    @Override
    public void maasGoster(){
        System.out.println("Doktor maasi:"+maas);
    }
}


public class Hemsire extends Personel{
    @Override
    public void calis(){
        System.out.println("hemsire hastalarla ilgileniyor");
    }
    @Override
    public void maasGoster(){
        System.out.println("Hemsire maasi :"+ maas);
    }
}
