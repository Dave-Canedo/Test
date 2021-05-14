public class Ejercicio71 {
    public static void main(String[] args) {
        int number = 100;

        int[] solution = getDividers(number);

       for(int i = 0; i<solution.length; i++) {
           System.out.print(solution[i]+", ");
       }
    }
    public static int[] getDividers(int number) {
        int counter = 0;
        int[] numberPrimes = new int[number];

        for(int i = 2; i<=number; i++) {
            if(number%i==0 && isPrime(i)) {
                numberPrimes[counter] = i;
                counter++;
            }
        }
        return numberPrimes;
    }
    public static boolean isPrime(int divider) {
        boolean isPrime = true;

        for(int i = 2; i<divider; i++) {
            if(divider%i==0) {
                isPrime = false;
            }
        }
        return isPrime;
    }
}