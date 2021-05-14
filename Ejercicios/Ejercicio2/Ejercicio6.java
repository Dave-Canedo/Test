import java.util.Scanner;
public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("introduzca un numero");

        int x = sc.nextInt();
        int y = 0;

        while(x!=0) { 
            y+=x;
            System.out.println("introduzca un nuevo numero");

            x=sc.nextInt();

        }
            System.out.println("la suma de los numeros introducidos es: "+y);
    }
}
// Pedir numeros hasta que se introduzca un 0. Al final mostrar la suma de todos los numero introducidos.



