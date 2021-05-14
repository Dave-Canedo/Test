import java.util.Scanner;
public class Ejercicio5 {
    public static void main(String[] args) {

        // Leer 5 números y mostrarlos en el mismo orden introducido.

        Scanner sc = new Scanner(System.in);

        System.out.println("introduzca 5 numeros");

        int [] number = new int[5];
        
        for(int counter = 0; counter<5; counter++) {

            number[counter] =sc.nextInt();

        }

        System.out.println("");
        
        for(int counter = 0; counter<5; counter++) {

            System.out.println(number[counter]);
        }
    }
    
}
