import java.util.Arrays;
import java.util.Scanner;

public class altroEsempio {
   // args è un array di stringhe
   public static void main(String[] args) {
      System.out.println("Ciao");
      System.out.print("Ciao");
      System.out.println();
      // system è una classe
      double prezzo = 50.64;
      System.out.println(prezzo);

      // conversione
      int prezzoInt = (int) prezzo;
      System.out.println(prezzoInt);

      String[] stagioni = new String[4];
      stagioni[0] = "primavera";
      stagioni[1] = "estate";

      String[] mesi = { "Gennaio", "Febbraio", "Marzo", "Aprile", "Maggio", "Giugno", "Luglio", "Agosto", "Settembre",
            "Ottobre", "Novembre", "Dicembre" };
      System.out.println(Arrays.toString(mesi));

      Scanner mioScanner = new Scanner(System.in);
      System.out.println("Inserisci il tuo nome");
      // String nomeUtente = mioScanner.nextLine();
      // System.out.println("Quanti anni hai, " + nomeUtente + "?");
      // int anni = mioScanner.nextInt();
      // System.out.println("Ciao " + nomeUtente + " hai " + anni + " anni");
      // if (anni >= 18) {
      // System.out.println(nomeUtente + " puoi votare");
      // } else {
      // System.out.println(nomeUtente + " non puoi votare");
      // }
      for (int i = 0; i <= 10; i++) {
         System.out.print(i % 2 == 1 ? i : "");
      }

      int i = 0;
      while (i <= 10) {
         System.out.print(i % 2 == 1 ? i : "");
         i++;
      }
   }
}