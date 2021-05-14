import java.util.Scanner;

public class Ejercicio9For {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("introducir el numero 100");

            for(int x= sc.nextInt(); x>=0; x-=7) {
                System.out.println(x);
            }
    }
}
    // Mostrar todos los numeros del 100 al 0 de 7 en 7.
//Ej: 100, 93, 86, .... (-=, --)

