import java.lang.Math;
import java.util.Scanner;

public class Trabajo7 {
    public static void main(String[] args) {
        System.out.println("introducir el radio de la circunferencia");
        Scanner sc = new Scanner(System.in);

        Double x = sc.nextDouble();
        Double z = x*x;
        Double a = Math.PI;
        Double y = a*z;

            System.out.println("El area de la circunferencia de radio "+x+" es: "+y);
    }
}
// Hacer un programa que pida el radio de un circulo y calcular su area. Mostrar el mensaje:
//"El area de una circunferencia de radio X: es Y".
