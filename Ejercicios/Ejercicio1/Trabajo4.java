import java.util.Scanner;

public class Trabajo4 {
    public static void main(String[] args) {
        System.out.println(" introducir dos numeros");
        Scanner sc = new Scanner(System.in);

        int numero1 = sc.nextInt();
        int numero2 = sc.nextInt();

        if(numero1==numero2) {
            System.out.println(numero1+" y "+numero2+" son iguales");
        } else {
            System.out.println(numero1+" y "+numero2+" no son iguales");
        }
    }
    
}
// introducir 2 numeros e imprimir si son iguales o no.