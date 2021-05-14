public class Ejercicio6 {

    public static int dividers(int number) { 
        boolean isPrime;
        int counter = 0;
        
        for(int i = 2; i<=number; i++) {
            if(number%i==0) {
                isPrime = prime(i);
                if(true) {
                    counter++;
                }
            }
        }
        return counter;
    }
    public static boolean prime(int divider) {
        boolean isPrime = true;

        for(int i = 2; i<divider; i++) {
            if(divider%i==0) {
                isPrime = false;
                break;
            }
        }
        return isPrime;
    }
    public static void main(String[] args) {
        int number = 4;
        int solution = dividers(number);

        System.out.println(number+" tiene "+solution+" divisores primos");
    }
}