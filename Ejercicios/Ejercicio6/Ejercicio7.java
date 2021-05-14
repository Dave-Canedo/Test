public class Ejercicio7 {
    public static void main(String[] args) {
        int number = 71;
        int[] solution = arrayPrimes(number);

        for(int i = 0; i<solution.length; i++) {
            System.out.print(solution[i]+", ");
        }
    }
    public static int[] arrayPrimes(int number)  {
        int counter = 0;
         
        for(int i = 2; i<=number; i++) {
            if(number%i==0 && isPrime(i)) {
                counter++;
            }
        }
        int[] arrayPrimes = new int[counter];

        counter = 0;

        for(int i = 2; i<=number; i++) {
            if(number%i==0 && isPrime(i)) {
                arrayPrimes[counter] = i;  
                counter++;        
            }
        }
        return arrayPrimes;
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

