import java.util.Scanner;
public class Ejercicio2 {
    
    public static void main(String[] args) {
        System.out.println("introducir un numero");
        Scanner sc = new Scanner(System.in);
        
        int x = sc.nextInt();

    while(x!=0) {
            
        if(x*1>0) {
                System.out.println(x+" es positivo");
        } else if(x*1<0) {
                System.out.println(x+" es negativo");
        }
                System.out.println("introducir un nuevo numero");
        
                x= sc.nextInt();
        }     
    }
}
// Leer un numero e indicar si es positivo o negativo. Repetir hasta que se introduzca 0.

// Se debe mostrar un mensaje para introducir un nuevo numero:
// "Introduzca un numero:"
// "X es positivo"
// "X es negativo"
