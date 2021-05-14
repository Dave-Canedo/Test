import java.util.Scanner;
public class Trabajo5 {
    public static void main(String[] args) {
        System.out.println("introducir un numero");
        Scanner sc = new Scanner(System.in);

        int numero1 = sc.nextInt();
        
        if(numero1>=0) {
                System.out.println(numero1+" es positivo");
        } else {
                System.out.println(numero1+" es negativo");
        }
    }         
}
    

