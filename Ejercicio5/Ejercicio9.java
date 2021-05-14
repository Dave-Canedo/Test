import java.util.Scanner;
public class Ejercicio9 {
    // Leer por teclado una serie de 10 números enteros. La aplicación debe indicarnos si los números están
    // ordenados de forma creciente, decreciente, o si están desordenados.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("introduzca 10 numeros");

        int[] numbers = new int[10];
        int increase = 0, decrease = 0, same = 0, messy = 0;

        for(int i = 0; i<10; i++) {
        
         System.out.println("introduzca el valor: "+(i+1));

            numbers[i] = sc.nextInt();
        }

        for(int i = 0; i<9; i++) {
            if(numbers[i]<numbers[i+1]) {
                increase++;
            } else if(numbers[i]>numbers[i+1]) {
                decrease++;
            } else if(numbers[i]==numbers[i+1]) {
                same++;
            } else {
                messy++;
            }
        }
       

        if(increase == 9) {
            System.out.println("los numeros introducidos estan ordenados de forma creciente");

        } else if(decrease == 9) {
            System.out.println("los numeros introducidos estan ordenados de forma decreciente");

        } else if(same == 9) {
            System.out.println("los numeros introducidos son iguales");

        } else {
            System.out.println("los numeros introducidos estan ordenados de forma desordenada");

        }
    }
}