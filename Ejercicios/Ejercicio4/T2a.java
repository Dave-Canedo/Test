import java.util.Scanner;
public class T2a {
    public static void main(String[] args) {

    // Hacer un programa que muestre el producto de los 10 primeros numeros impares (Usar un "for")
        Scanner sc = new Scanner(System.in);
        System.out.println("introduzca un numero impar");

        int b = 1;
        int c = 1;
        int e = 0;

        for(int a = sc.nextInt(); a%2==1 && b<=10 ; b++ ) {
          
            c*=a;

            System.out.println("introduzca otro numero impar");

            a = sc.nextInt();

        }
            System.out.println("el producto de los numeros impares introducidos es: "+c);
    }
}