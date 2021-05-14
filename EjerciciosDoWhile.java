import java.util.Scanner;

public class EjerciciosDoWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" introducir una nota");

        int x=sc.nextInt();
        int y = 0;
        int z = 0;

        do {
            if(x>=7) {
                y++;
            } else {
                z++;
            }
                System.out.println( "introduzca otro numero");

                x=sc.nextInt();

        } while(x>0);

        System.out.println("son "+y+" notas mayor o igual a 7");
        System.out.println(" son "+z+" notas menores a 7");

    } 
}     
    // Escribir un programa que solicite ingresar n notas de alumnos y nos informe cuántos tienen notas mayores o iguales a 7 y cuántos menores. 
    // El programa termina cuanto se ingrese un valor de 0.
            