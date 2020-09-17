package fr.dauphine.ja.chilhagopianJulien.td00;

import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

/**
 * Hello world!
 */
public class PrimeCollection {
    int toto = 0;
    private ArrayList<Integer> numbers;

    public PrimeCollection(ArrayList<Integer> numbers) {
        this.numbers = numbers;
    }

    public static void main(String[] args) {
        PrimeCollection prime = new PrimeCollection(new ArrayList<>());
        prime.initRandom(100, 1000);
        prime.printPrimes();
    }

    public void initRandom(int n, int m) {
        for (int i = 0; i < n; i++) {
            int randomNum = ThreadLocalRandom.current().nextInt(0, m);
            numbers.add(randomNum);
        }
    }

    private Boolean isPrime(int p) {
        Boolean prime = true;
        if (p <= 1) {
            prime = false;
        } else {
            for (int i = 2; i <= Math.sqrt(p); i++) {
                if ((p % i) == 0) {
                    prime = false;
                }
            }
        }
        return prime;
    }

    public void printPrimes() {
        numbers.forEach((Integer n) -> {
            if (isPrime(n)) {
                System.out.println("this number is prime : " + n);
            }
        });
    }

    public int getToto() {
        return toto;
    }

    public void setToto(int toto) {
        this.toto = toto;
    }

}
