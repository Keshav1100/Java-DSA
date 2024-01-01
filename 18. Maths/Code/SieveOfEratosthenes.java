public class SieveOfEratosthenes {
    public static void main(String[] args) {
        int n = 40;
        boolean[] primes = new boolean[n+1];
        sieve(n,primes);
        // printing the primes from the array
        for (int i = 2; i < primes.length; i++) {
            if(!primes[i]){
                System.out.print(i+" ");
            }
        }
    }
    // false means the no is prime as by
    // default all values in this boolean array will be false
    public static void sieve(int n, boolean[] primes){
        for(int i = 2;i*i<n;i++){
            if(!primes[i]) {
                if (primeCheck(i)) {
                    primes[i] = false;
                    for (int j = i+i; j < n + 1; j += i) {
                        primes[j] = true;
                    }
                }
            }
        }

    }
    public static boolean primeCheck(int n){
        for (int i = 2; i < Math.sqrt(n); i++) {
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
}
