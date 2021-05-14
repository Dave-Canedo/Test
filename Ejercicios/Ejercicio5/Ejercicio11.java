package Ejercicios.Ejercicio5;
import java.util.Scanner;
public class Ejercicio11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int [] numbers = new int[10];
        int LastNumber = 0;

        System.out.println("introduzca 10 valores para el array");

        for(int i = 0; i<10; i++) {

            System.out.println("introduzca el valor # "+(i+1)); 

            numbers[i] = sc.nextInt();   
        }

        LastNumber = numbers[9];
            
        for(int i = numbers.length-1; i>0; i--) {

            numbers[i] = numbers[i-1];
        }

        numbers[0] = LastNumber;

        for(int i = 0; i<9; i++) {

            System.out.print(numbers[i]+", ");
        }

        System.out.print(numbers[9]);
    }
}