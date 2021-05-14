import java.util.Scanner;
public class Ejercicio9 {
    public static void main(String[] args) {
        System.out.println("introducir el numero 100");
         Scanner sc = new Scanner(System.in);

         int c = sc.nextInt();

         while(c>=0) {
             System.out.println(c);

             c-=7;
             
         }
    }
}
// Mostrar todos los numeros del 100 al 0 de 7 en 7.
//Ej: 100, 93, 86, .... (-=, --)


