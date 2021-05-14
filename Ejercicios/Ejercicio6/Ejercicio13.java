package Ejercicios.Ejercicio6;
import java.util.Scanner;
public class Ejercicio13 {
    static boolean esPrimo(int number) {
            boolean primo = true;

        for(int i = 2; i<number; i++) {
           
            if(number%i==0)
            primo = false;
        }
        return primo;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("introduzca un numero");

        int numbers = sc.nextInt();

        boolean primo = esPrimo(numbers);

        if(primo == true) {
            System.out.println("el numero es primo");
        } else {
            System.out.println("el numero no es primo");
        }

    }
    
}
