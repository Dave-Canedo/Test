import java.util.Scanner;
public class Ejercicio3 {
    public static void main(String[] args) {
        System.out.println("introducir un numero");
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();

        while(x!=0) {
            if(x%2==0) {
                System.out.println(x+" es par");
            }else if(x%2==1 || x%2==-1) {
                System.out.println(x+" es impar");
            }
                System.out.println("introducir numevo numero");

                x=sc.nextInt();
        }
    }   
}
// Leer un numero y mostrar si es par o impar. Repetir hasta que se introduzca un 0.

// Se debe mostrar un mensaje para introducir un nuevo numero:
// "Introduzca un numero:"
// "X es par"
// "X es impar"