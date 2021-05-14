import java.util.Scanner;
public class T4 {
    public static void main(String[] args) {
        // Hacer un programa que pida un numero e indicar si es capicua o no.

        Scanner sc = new Scanner(System.in);
        System.out.println("introduzca un numero");

        int x = sc.nextInt();
        int a = x;
        int b = 0;
        int c = 0;

        while(x>0) {
            b=x%10;
            c = (c*10)+b;
            x/=10;  
        }
        
        if(a==c) {
            System.out.println("el numero "+a+" es capicua");
        } else {
            System.out.println("el numero "+a+" no es capicua");
        }
    }
}








