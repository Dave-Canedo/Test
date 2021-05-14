import java.util.Scanner;

public class intro { 

    public static void main(String[] args) {
        System.out.println("introduzca un numero entero:");
        Scanner sc = new Scanner(System.in);
        int numero = sc.nextInt();
sc.close();
        System.out.println("el usuariio hauntroducido el numero:"+numero);

    }
} 
