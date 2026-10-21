public class PrimesInRange {
    public static void main(String[] args) {
        int low = 10, high = 50;
        System.out.print("Primes between " + low + " and " + high + ": ");
        for (int num = low; num <= high; num++) {
            boolean isPrime = num > 1;
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
        System.out.println();
    }
}
