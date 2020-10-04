/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package firsthue;

/**
 *
 * @author Marcel.Lindinger
 */
public class EratosthenesPrimeSieve implements PrimeSieve {

    public final int obergrenze;

    public EratosthenesPrimeSieve(int obergrenze) {
        this.obergrenze = obergrenze;
    }

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
            }
        }
        System.out.println("Primzahlen von 1 - " + obergrenze + "sind: " + primeNumbers);
    }

}
