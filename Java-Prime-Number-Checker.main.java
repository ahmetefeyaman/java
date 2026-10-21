import java.util.Scanner;

public class main {
    public static void main(String[] args){
       Scanner scanner = new Scanner(System.in);

       int n;

        System.out.println("Dizi kac elemanli?");
          n = scanner.nextInt();
       int[] asal= new int[n];
        System.out.println("Dizi elemanlarini giriniz.");
         for(int i=0;i<asal.length;i++){
            asal[i]= scanner.nextInt();
         }
          for(int i=0;i< asal.length;i++) {
             boolean asalMi=true;
              for (int j = 2; j < asal[i]; j++) {
                  if (asal[i] % j == 0) {
                      asalMi = false;
                      break;

                  }


              }
              if (asal[i]<2) {
                  System.out.println("Sayi:"+ asal[i]+ "asal sayi degildir.");
              } else if (asalMi) {
                  System.out.println("Sayi:" + asal[i] + " asal sayidir.");
                  
              } else {
                  System.out.println("Sayi:" + asal[i] + " asal sayi degildir.");
              }

          }
          }
    }
