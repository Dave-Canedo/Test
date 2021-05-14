import java.util.Scanner;
public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("introduzca tres numeros");

        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();

        if(x>=y && y>=z) {
            System.out.println(x+", "+y+", "+z);

        } else if(x>y && y==z || x>y && y<z && x>z) {
            System.out.println(x+", "+z+", "+y);

        } else if(x>y && y<z && x>z || x==y && y<z) {
            System.out.println(z+", "+x+", "+y);

        } else if(x<y && y>z && x<z || x<y && y==z) {
            System.out.println(y+", "+z+", "+x);

        } else if(x==y && y>z || x<y && y>z && x<z) {
            System.out.println(y+", "+x+", "+z);

        } else {
            System.out.println(x<=y && y<=z);
        }
    }
}   

// pedir tres numeros y mostrarlos de mayor a menor