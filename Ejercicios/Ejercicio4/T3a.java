import java.util.Scanner;
public class T3a {
    public static void main(String[] args) {

        // Hacer un programa que pida un numero y muestre la suma de los 10 primero numeros impares a partir de ese numero introducido. (usar for)
  
        Scanner sc = new Scanner(System.in);
        System.out.println("introduzca un numero");

        int b = 1;
        int c = 0;

        for(int x=sc.nextInt(); b<=10; b++) {
            if(x%2==0) {
                b--;
                x++;
            } else {
              c+=x;
              x+=2;  
            }
        }
            System.out.println("la suma de los numeros es: "+c);


    }
}