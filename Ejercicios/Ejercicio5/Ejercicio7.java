import java.util.Scanner;
public class Ejercicio7 {
    // Leer 10 números enteros. Debemos mostrarlos en el siguiente orden: el primero, el último, el segundo, el penúltimo, el tercero, etc.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int[] numeros = new int[10];
        int x = 10;

        System.out.println("introduzca 10 numeros");

        for(int casillero = 0; casillero<10; casillero++) {

            numeros[casillero] = sc.nextInt();
        }

        System.out.println("");
        
        for(int contador = 10; contador>0; contador--) {
            if(contador%2==0) {
                x = x - contador;
                System.out.println(numeros[x]);
            } else {
                x = x + contador;
                System.out.println(numeros[x]);
            }
        }
    }
}
