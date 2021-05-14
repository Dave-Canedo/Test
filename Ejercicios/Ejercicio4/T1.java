
import java.util.Scanner;
public class T1 {
    public static void main(String[] args) {

        // Leer cinco numeros para luego sumarlos y mostrar el resultado de dicha suma. Mostrando el mensaje antes de cada
        // lectura y con una sola variable

        Scanner sc = new Scanner(System.in);
            System.out.println("introducir un numero");

        int x = sc.nextInt();
            System.out.println("introducir otro numero");

            x += x =sc.nextInt();
            System.out.println("introduzca otro numero");
            
            x+=x = sc.nextInt();
            System.out.println("introduzca un numero");

            x+=x = sc.nextInt();
            System.out.println("introduzca un numero");

            x+=x = sc.nextInt();
            System.out.println("la suma de los numeros introducidos es: "+x);
    }
}