import java.util.*;
public class PrimeFactors {

    public static void main (String[] args) {
        PrimeFactors primeFactors = new PrimeFactors();
        int number = 30;
        System.out.println(primeFactors.numFactors(number));
    }

    public ArrayList<Integer> numFactors(int number) {
        ArrayList<Integer> factors = new ArrayList<Integer>();
        for (int i = number; i > 1; --i) {
            if(number % i == 0) {
                if(isPrime(i)) {
                    factors.add(i);
                }
            }
        }
        Collections.reverse(factors);
        return factors;
    }

    boolean isPrime(int n) {
        for(int i = 2; i < n; i++) {
            if(n % i == 0)
                return false;
        }
        return true;
    }

}