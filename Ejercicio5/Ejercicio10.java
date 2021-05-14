package Ejercicios.Ejercicio5;
import java.util.Scanner;
public class Ejercicio10 {
    public static void main(String[] args) {
    //Diseñar una aplicación que declare un array de 10 elementos enteros. 
    //Leer mediante el teclado 8 números. Después se debe pedir un número y una posición, insertarlo en la posición indicada, desplazando los que estén detrás. 

        Scanner sc = new Scanner(System.in);

        int[] numbers = new int[10];
        int newNumber, position;

        System.out.println("introduzca 8 numeros");

        for(int i = 0; i<8; i++) {

            System.out.print("introduzca el # "+(i+1)+": ");

            numbers[i] = sc.nextInt();
        }

        System.out.print("introduzca un nuevo numero: ");

            newNumber = sc.nextInt();

        System.out.print("introduzca la posicion para el nuevo numero: ");

            position = sc.nextInt();

        for(int i=numbers.length-1; i>=position; i--) {

            numbers[i] = numbers[i-1];
        }

        numbers[position] = newNumber;

        for(int i = 0; i<=9; i++) {

            System.out.print(numbers[i]+", ");

        }
    }
}