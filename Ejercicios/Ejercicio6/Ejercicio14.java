import java.util.Scanner;
public class Ejercicio14{
    // Escriba una función que reciba una base y un exponente y devuelva la potenciación usando ambos números
    static int potenciacion(int base, int exponente) {

        int resultado = 1;

        for(int i = 0; i<exponente; i++) {

            resultado = base*resultado;

        }
        return resultado;
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("introduzca la base: ");
        int b = sc.nextInt();

        System.out.print("Introduzca el exponente: ");
        int e = sc.nextInt();

        int solucion = potenciacion(b, e);

        System.out.println("La potenciacion de "+b+" elevado a "+e+ " es: "+solucion); 
    }
}