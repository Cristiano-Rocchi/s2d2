package Esercizio1;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        /* chieder allutente di inserire un numero */
        Scanner scanner = new Scanner(System.in);
        System.out.println("inserisci un numero di parole: ");
        int N = Integer.parseInt(scanner.nextLine());

        Set<String> paroleDistinte = new HashSet<>();
        Set<String> paroleDuplicate = new HashSet<>();


        /*chiedere all'utente di inserire le parole*/
        for (int i = 0; i < N; i++) {
            System.out.println("inserisci una parola: ");
            String parola = scanner.nextLine();



            /*verificare la parola*/
            if (!paroleDistinte.add(parola)) {
                paroleDuplicate.add((parola));
            }


        }
        if (!paroleDuplicate.isEmpty()) {
            System.out.println("Parole duplicate: " + paroleDuplicate);
        } else {
            System.out.println("Nessuna parola duplicata.");
        }

        System.out.println("Numero di parole distinte: " + paroleDistinte.size());
        System.out.println("Elenco delle parole distinte: " + paroleDistinte);
    }
}