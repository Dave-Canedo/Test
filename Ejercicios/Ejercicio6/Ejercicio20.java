public class Ejercicio20 {
    // Escribir una función que muestre un numero decimal del 0 al 255. La función debe recibir un número en sistema binario y mostrarlo en decimal.
    public static void main(String[] args) {
        int binary = 1101;

        double result = BinToDec(binary);

        if(result>=0 && result<=255) {
            System.out.println("el numero binario "+binary+" equivale al numero decimal "+result);
        } else {
            System.out.println("el numero binario "+binary+" no equivale a un numero del sistema decimal entre el 0 y 255");
        }
    }
    public static double BinToDec(int bin) {
        int residuum;
        int pow = 0;
        double result1 = 0;
        double result2 = 0;

        while(bin>0) {
            residuum = bin%10;
            bin = bin/10; 

            result1 = Math.pow(2, pow); 
            result2 += residuum*result1;             
             
            pow++; 
        }
        return result2;
    }
}
