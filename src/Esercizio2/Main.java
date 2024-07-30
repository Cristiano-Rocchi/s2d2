package Esercizio2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        System.out.println("Inserire in numero N: ");
        int n = Integer.parseInt(scanner.nextLine());

        List<Integer> numeri = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int numeroCasuale = (int) (Math.random() * 101);
            numeri.add(numeroCasuale);
        }
        ;
        System.out.println(numeri);

    }


}

