import java.util.Scanner;
public class T3 {
    public static void main(String[] args) {

        // Hacer un programa que pida un número positivo al usuario, voltearlo, guardarlo en otra variable y mostrarla.
        // Ej: Si el usuario introduce 1234, el programa debe mostrar 4321.
        
        Scanner sc = new Scanner(System.in);
        System.out.println("introduzca un numero positivo");

        int x = sc.nextInt();
        int y = 0;
        int a = 0;

        while(x>0) {
            a = x%10;
            y = (y*10)+a;
            x/=10;
        }
            System.out.println(y);
    }
}