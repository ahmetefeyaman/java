import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

         //en buyuk 2.

         System.out.println("dizi kac elemanli olsun");
          int n = scanner.nextInt();
           int[] sayi = new int[n];
            System.out.println("dizinin elemanlarini giriniz");
             for (int i= 0; i< sayi.length;i++){
                 sayi[i] = scanner.nextInt();
             }
              eb2(sayi);

    }

    public static void eb2(int[] sayi){
       int enbuyuk= sayi[0];
        for(int i=0;i< sayi.length;i++){
            if(sayi[i]>enbuyuk){
                enbuyuk= sayi[i];
            }
        }
        int enbuyuk2=Integer.MIN_VALUE;
        for(int j=0;j< sayi.length;j++){
            if ((sayi[j]<enbuyuk) && (enbuyuk2<sayi[j])){
                enbuyuk2= sayi[j];
                }
        }
         System.out.println("En Buyuk Sayi: "+ enbuyuk +"\n"+"En Buyuk 2. Sayi: "+ enbuyuk2);
    }

}
