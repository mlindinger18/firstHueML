/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package firsthue;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Marcel.Lindinger
 */
public class EratosthenesPrimeSieve implements PrimeSieve {

    public final int obergrenze;
    List primesList = new ArrayList();

    public EratosthenesPrimeSieve(int obergrenze) {
        this.obergrenze = obergrenze;
    }

    //Aufgabe 1
    @Override
    public boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }

        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    @Override
    public void printPrimes() {
        int i = 0;
        int number = 0;
        String primeNumbers = "";
        for (i = 1; i <= obergrenze; i++) {
            int counter = 0;
            for (number = i; number >= 1; number--) {
                if (i % number == 0) {
                    counter = counter + 1;
                }
            }
            if (counter == 2) {
                primeNumbers = primeNumbers + i + " ";
                primesList.add(primeNumbers);
            }
        }
        System.out.println("Primzahlen von 1 - " + obergrenze + "sind: " + primeNumbers);
    }

    //Aufgabe 2
    //Obere und Untere Schleife durchlaufen, um sich in der Mitte zu treffen(Beide Werte werden immer addiert und es wird gecheckt, ob die Zahl gerade ist)
    public void Rechner() {
        for (int i = 0; i < obergrenze; i++) {
            int value1 = primesList.indexOf(i);
            for (int j = obergrenze; j < obergrenze; j--) {
                int value2 = primesList.indexOf(j);
                i = value1 + value2;
                if (i % 2 == 0) {
                    System.out.println("Zahl " + i + ": " + value1 + " + " + value2);
                }
            }

        }
    }
}
