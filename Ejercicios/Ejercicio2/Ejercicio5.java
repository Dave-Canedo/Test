import java.util.Scanner;
public class Ejercicio5 {
    public static void main(String[] args) {
        System.out.println("introducir el numero N");
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        System.out.println("introducir el numero correcto");

        int X = sc.nextInt();
        int x = 0;

        while(X!=N) {
            x++;

            if(X>N) {
                System.out.println(X+" es mayor al numero N");
            }else if(X<N) {
                System.out.println(X+" es menor al numero N");
            }
                System.out.println("introduzca un nuevo numero");

        X = sc.nextInt();
        }
            x+=1;
                System.out.println("se realizo "+x+" intento(s)");

                System.out.println("acerto, felicidades!!!");
    }
}
    // Realizar un juego para adivinar un numero. Para ello pedir un numero N y luego ir pidiendo numero indicando si es mayor o menor con respecto a N. 
    // El proceso termina cuando el usuario acierta con el numero N. Mostrar cuántos intentos hizo para adivinar el numero.



