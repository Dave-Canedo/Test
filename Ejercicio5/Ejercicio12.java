package Ejercicios.Ejercicio5;
import java.util.Scanner;
public class Ejercicio12 {
    public static void main(String[] args) {
    // Crear un programa que lea por teclado un array de 10 números enteros y lo desplace N posiciones hacia abajo.
        Scanner sc = new Scanner(System.in);

        int[] numbers = new int[10];
        int[] numbers2 = new int[10];
        int position;

        System.out.println("introduzca los 10 numeros para el array");

        for (int i = 0; i<10; i++) {

            System.out.println("introduzca la posicion # "+(i+1));

            numbers[i] = sc.nextInt();
        }

        System.out.println("introduzca el numero de posiciones que quiere que se recorra el array");

        position = sc.nextInt();

        position = position%10;

        for(int i = 0; i<10; i++) {

            numbers2[i] = numbers[i];
        }

        for(int i = 0; i<10; i++) {

            numbers[(i+position)%10] = numbers2[i];
        }

        for(int i = 0; i<10; i++) {

            System.out.print(numbers[i]+", ");
        }
    }
}