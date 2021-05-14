import java.util.Scanner;
public class Ejercicio4 {
    public static void main(String[] args) {
        System.out.println("introduzca un numero");
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int y = 0;

        while(x>=0) { 
            
            y++;
                System.out.println("introducir otro numero");

                x = sc.nextInt();
            }  
                System.out.println("se introdujo "+y+" numero(s)");              
        }
    }
// Leer numeros hasta que se introduzca uno negativo. Después mostrar cuántos números se han introducido.

//Se debe mostrar un mensaje para introducir un nuevo numero:
//"Introduzca un numero:"
//"Se introdujeron X numeros"
    
