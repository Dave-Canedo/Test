import java.util.Scanner;
public class T9 {
    public static void main (String[] args) {
        // Pide un numero (que debe estar entre 0 y 10) y mostrar la tabla de multiplicar de dicho numero.

 
        Scanner sc = new Scanner(System.in);
        System.out.println("introduzca un numero");

        int numero = sc.nextInt();

        for(int contador = 1; contador<=10; contador++) {

            int resultado = numero*contador;

            System.out.println(numero+" "+"x"+" "+contador+" "+"="+" "+resultado);
        }

    }
}
