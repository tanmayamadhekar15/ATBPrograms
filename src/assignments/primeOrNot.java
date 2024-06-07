package assignments;

public class primeOrNot {
    public static void main(String[] args) {
        System.out.println("Prime Numbers:");
        printPrimes(20);
    }
    static void printPrimes(int limit) {
        for (int num = 2; num <= limit; num++) {
            if (isPrime(num)) {
                System.out.print(num + " ");
            }
        }
        System.out.println();
    }
    public static boolean isPrime(int num) {
        if (num <= 1) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
}
