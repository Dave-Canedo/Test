import java.util.Scanner;
public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("introduzca un numero");

        float x = sc.nextInt();
        float y = 0;
        float z = 0;

        while(x>=0) {
            y+=x;
            z++;  
            
            System.out.println("introduzca otro numero");

            x = sc.nextFloat();
        }
        float a = y/z;
        
        System.out.println("la media de la suma de los numeros introducidos es: "+a);
    }   
}
// pedir numero hasta que se introduzca uno negativo y calcular la media