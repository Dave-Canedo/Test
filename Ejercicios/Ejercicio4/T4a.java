import java.util.Scanner;
public class T4a {
    public static void main(String[] args) {
        // Pedir un numero y calcular su factorial. (while o for).
  // ej: si el usuario introduce 6, se debe mostrar el resultado de (6 * 5 *4 *3 *2 *1)

        Scanner sc = new Scanner(System.in);
        System.out.println("introduzca un numero");

        int x = sc.nextInt();
        int y = x;

        while(x>1) {
            x--;
            y*=x;
        }
        System.out.println(y);
    }
}