import java.util.Scanner;
public class Ejercicio6 {
    public static void main(String[] args) {

        // Leer 5 números y mostrarlos en orden inverso al introducido.

        Scanner sc = new Scanner(System.in);

        int[] numbers = new int[5];

        System.out.println("Introduzca 5 numeros");

        for(int counter = 0; counter<5; counter++) {

            numbers[counter] = sc.nextInt();
        }

        System.out.println("");
        
        for(int counter = 4; counter>=0; counter--) {

            System.out.println(numbers[counter]);
        }
    }
    
}
