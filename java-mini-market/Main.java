import java.util.Scanner;

public class Main {
    public static void main(String[] args){
       Scanner scanner = new Scanner(System.in);

        double Aleblebi = 3.5;
        double Afindik = 15.7;
        double Abadem = 22;

         System.out.println("Urunlerin (Kg) toptam alis fiyatlari->" + "   " + "Leblebi:" + Aleblebi + "   " + "Findik:" + Afindik + "   " + "Badem:" + Abadem);
          System.out.println("Urunlerden sirasiyla kaçar kg alacaginizi giriniz.(l/f/b)");
           double al = scanner.nextDouble();
           double af = scanner.nextDouble();
           double ab = scanner.nextDouble();
            double totalalim = (al * 3.5) + (af * 15.7) + (ab * 22);
             double maaliyet = -1 * (totalalim);
              System.out.println("Guncel para miktari: " + maaliyet);

        double Sleblebi = (Aleblebi * 1.5);
        double Sfindik = (Afindik * 1.4);
        double Sbadem = (Abadem * 1.6);
         System.out.println("Urunlerin (Kg) satis fiyatlari->" + "   " + "Leblebi:" + Sleblebi + "   " + "Findik:" + Sfindik + "   " + "Badem:" + Sbadem);
          System.out.println("Urunlerden sirasiyla kaçar kg sattiginizi giriniz.(l/f/b)");
           double sl = scanner.nextDouble();
           double sf = scanner.nextDouble();
           double sb = scanner.nextDouble();
            if(al<sl || af<sf || ab<sb){
                System.out.println("Hatali miktar girisi! ---> Tekrar deneyiniz!");
            }
            else{
                double kazanç = (Sleblebi * sl) + (Sfindik * sf) + (Sbadem * sb);
                 double kar = (kazanç + maaliyet);
                 System.out.println("Guncel para miktari: " + kar);
                  int kira = 500;
                   if(kar<kira){
                       System.out.println("Kira Ödenemedi!");
                   }
                   else{
                       System.out.println("Kira Ödendi!");
                   }
            }
            
    }
}
