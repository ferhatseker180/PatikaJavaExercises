package week1;

public class PrimeNumbers {
    public static void main(String[] args) {

        // we started 2 because 1 isn't prime numbers and every number can divide it.
        // isPrime: This is a prime numbers boolean control statement

        for (int num = 2; num <= 100; num++) {
            boolean isPrime = true;
            for (int i = 2; i <= num / 2; i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.print(num + " ");
            }
        }

    }
}
