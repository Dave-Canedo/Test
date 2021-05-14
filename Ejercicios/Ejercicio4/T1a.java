
import java.util.Scanner;
public class T1a {
    public static void main(String[] args) {

        //introduzca 15 numeros y mostrar la suma total

        Scanner sc = new Scanner(System.in);
        System.out.println("introduzca un numero");

        int b = 1;
        int c = 0;

        for(int a = sc.nextInt(); b<=15 ; b++) {

            c+=a;
            System.out.println("introducir otro numero");

            a = sc.nextInt();
        }

        System.out.println("la suma de los numeros introducidos es: "+c);
    } 
}