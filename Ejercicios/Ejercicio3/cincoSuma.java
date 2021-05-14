import java.util.Scanner;

public class cincoSuma {

    public static void main(String[] args) {

    
        System.out.println("introducir cinco numeros");
        Scanner sc = new Scanner(System.in);
        int numero = sc.nextInt() + sc.nextInt() + sc.nextInt() + sc.nextInt() +  sc.nextInt();
        
        System.out.println("la suma de los numeros introducidos, es "+numero);
    }
}


