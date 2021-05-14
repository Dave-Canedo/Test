import java.util.Scanner;

public class NumeroDoble {
    public static void main(String[] args) {
        System.out.println("introducir un numero");
        Scanner sc = new Scanner(System.in);
        int numero = sc.nextInt();

        System.out.println("se introdujo el numero"+" "+numero*2);
sc. close();
    }
    
}
