
import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        System.out.println("introduzca un numero");
        Scanner sc= new Scanner(System.in);

        int x = sc.nextInt();

        while(x>=0) {
            
            int y = x*x;

                System.out.println("el cuadrado de "+x+" es: "+y);

                System.out.println("introduzca un nuevo numero");

                x= sc.nextInt();
        }
                 
    }
}

// Leer un numero y mostrar su cuadrado, repetir el proceso hasta que se introduzca un numero negativo.

// Se debe mostrar un mensaje para introducir un nuevo numero:
// "Introduzca un numero:"
// "El cuadrado de X es Y"


