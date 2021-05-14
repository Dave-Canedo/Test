import java.util.Scanner;
public class T2 {
    public static void main(String[] args) {

        // Hacer de nuevo el ejercicio 11 (mostrar el número de dígitos de un número).

        Scanner sc = new Scanner(System.in);
        System.out.println("introduzca un numero de 0 al 99999");

        int x = sc.nextInt();
        int y = 0;

        while(x>0 && x<=99999) {
            x=x/10;
            y++;
        }
        System.out.println("el numero tiene "+y+" cifra(s)");
    } 
}