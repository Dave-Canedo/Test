import java.util.Scanner;
public class Ejercicio8 {
    public static void main(String[] args) {
        System.out.println("introducir un numero");
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = 0;

        while(m<=n) {
            int o = m++;
                System.out.println(o);
        }
    } 
}
// Pedir un numero N, y mostrar todos los numeros del 1 al N.