import java.util.Scanner;

public class main {
    public static void main(String[] args){
       Scanner scanner = new Scanner(System.in);

       int n;
       System.out.println("bir sayi giriniz.");
         n = scanner.nextInt();

      for(int i = 2 ; i <= n ; i++){
          boolean asal = true;
          for(int j = 2 ; j < i ; j++){
              if(i % j == 0){
                  asal = false;
                  break;
              }
              }
              if(asal) {
                  System.out.println(i);
              }
          }
      }

    }
