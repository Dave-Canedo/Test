public class Ejercicio6 {
    public static boolean isPrime(int number) {
        boolean isPrime = true;
        
        for(int i = 2; i<number; i++) {
            if(number%i==0) {
                isPrime = false;
            } 
        }
        return isPrime;
    }
    public static int getNumberPrimes(int number) {
        int counter = 0;

        for(int i = 2; i<=number; i++) {
            if(number%i==0 && isPrime(i)) {
                counter++;
            }
        }
        return counter++;
    }
    public static void main(String[] args) {
        int number = 10;

        int solution = getNumberPrimes(number);

        System.out.println(number+" tiene "+solution+" divisor(es) primo(s)");
    }
}