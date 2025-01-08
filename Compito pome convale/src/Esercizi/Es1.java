package Esercizi;

import java.util.Scanner;

public class Es1 {
    public static boolean PariDispari(String parola) {
        return parola.length() % 2 == 0;
    }

    public static boolean AnnoBisestile(int anno) {
        return anno % 4 == 0 && (anno % 100 == 0 ? anno % 400 == 0 : true);
    }
}
