import java.util.Scanner;
public class Ejercicio16 {
    static void odd(int number) {
        int counter = 0;
        int num = 0;

        while(counter<number) {
            if(num%2!=0) {

                System.out.println(num);
                counter++;
                num+=2;

            } else {
                num++;
            }
        }
        if(number==0) {
            System.out.println("error");
        }
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("introduzca un numero: ");

        int num2 = sc.nextInt();

        odd(num2);
    }
}
