import java.util.Scanner;
public class Ejercicio1 {
    public static void main(String[] args) {

        // Pedir un número N, introducir N sueldos, y mostrar el sueldo máximo.
        
        Scanner sc = new Scanner(System.in);
        System.out.println("introduzca un numero");

        int number = sc.nextInt();
        int MaxNumber = 0;
                
            System.out.println("introduzca "+number+" sueldo(s)");

        for(int counter = 0; counter<number; counter++) {

            System.out.println("introduzca sueldo # "+(counter+1));
            int Sueldos = sc.nextInt();

            if(MaxNumber<=Sueldos) {
                MaxNumber = Sueldos;
            }
        }
            System.out.println("El sueldo mayor es: "+MaxNumber);
    }
}
