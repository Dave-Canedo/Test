import java.lang.Math;
import java.util.Scanner;

public class Trabajo6 {
    public static void main(String[] args) {
        System.out.println("se pide el radio de una circunferencia");
        Scanner sc = new Scanner(System.in);

        float X = sc.nextFloat();
        float Z = 2;
        Double A = Math.PI; 
        Double Y = Z*A*X;

        System.out.println("La longitud la circunferencia de radio "+X+" es: "+Y);

        
    }
}
//Hacer un programa que pida el radio de una circunferencia, calcular la longitud de su circunferencia y mostrarla en un mensaje que tenga el siguiente formato:
//"La longitud de una circunferencia de radio X es: Y".//
