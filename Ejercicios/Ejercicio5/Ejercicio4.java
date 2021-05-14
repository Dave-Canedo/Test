import java.util.Scanner;
public class Ejercicio4 {
    // Realizar un programa que nos pida un número n, y nos diga cuantos números hay entre 1 y n que son primos.
    public static void main(String[] args) {
        
        int n1 = 2;
        int counter1 = 0;
        int counter2 = 0;

        Scanner sc = new Scanner(System.in);
        System.out.println("introduzca un numero");

        int n = sc.nextInt();

        while(n1<=n) {
            for(int n3 = 2; n3<=n1; n3++) {
                if(n1%n3==0) {
                    counter1++;
                } 
            }
            if(counter1==1) {
                counter2++;
            }
            counter1 = 0;
            n1++;
        }
        System.out.println("entre 1 y "+n+" hay "+counter2+" numero(s) primo(s)");
    }
}