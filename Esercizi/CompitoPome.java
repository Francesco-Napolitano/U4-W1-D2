package Esercizi;

import java.util.Scanner;

public class CompitoPome {
   public static void main(String[] args) {
      System.out.println("Inserisci una parola: ");
      Scanner myScanner = new Scanner(System.in);
      String parolaSos = myScanner.nextLine();
      if (CompitoPome.PariDispari(parolaSos)) {
         System.out.println(true + " E' una parola pari");
      } else {
         System.out.println(false + " E' una parola dispari");
      }
      System.out.println("Inserisci un anno: ");
      int numeroScelto = myScanner.nextInt();

   }

   public static boolean PariDispari(String parola) {
      return parola.length() % 2 == 0;
   }

   public static boolean AnnoBisestile(int anno) {
      return anno % 4 == 0 && (anno % 100 == 0 ? anno % 400 == 0 : true);
   }
}
