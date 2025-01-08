import java.util.Scanner;

public class CompitoPome {
   public static void main(String[] args) {
      System.out.println("Inserisci una parola: ");
      Scanner myScanner = new Scanner(System.in);
      String parolaSos = myScanner.nextLine();
      if (PariDispari(parolaSos)) {
         System.out.println(true + " E' una parola pari");
      } else {
         System.out.println(false + " E' una parola dispari");
      }
   }

   public static boolean PariDispari(String parola) {
      return parola.length() % 2 == 0;
   }
}
