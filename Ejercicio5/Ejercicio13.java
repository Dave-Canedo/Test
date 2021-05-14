import java.util.Scanner;
public class Ejercicio13 {
    public static void main(String[] args) {
    // Leer por teclado una serie de 10 números enteros.
    //La aplicación debe indicarnos si los números están ordenados de forma creciente, decreciente, o si no cumple con ninguno de los dos.

        Scanner sc = new Scanner(System.in);

        int[] numbers = new int[10];
        int creciente = 0, decreciente = 0, igual = 0;

        System.out.println("introduzca los 10 numeros del array");

        for(int i = 0; i<10; i++) {
            System.out.println("introduzca el valor # "+(i+1));

            numbers[i] = sc.nextInt();
        }

        for(int i = 0; i<9; i++) {
            
            if(numbers[i]<numbers[i+1]) {
                creciente ++;
            } else if(numbers[i]>numbers[i+1]) {
                decreciente ++;
            } else if(numbers[i]==numbers[i+1]) {
                igual++;
            }
        }

        if(creciente >0 && decreciente == 0 && igual<9) {
            System.out.println("los valores introducidos estan ordenados de forma creciente");
        } else if(decreciente >0 && creciente == 0 && igual<9) {
            System.out.println("los valores introducidos estan ordenados de forma decreciente");
        } else if(igual==9 || creciente>0 && decreciente>0) {
            System.out.println("los valores introducidos no corresponden a ninguno (creciente ni decreciente)");
        } 
    }
}