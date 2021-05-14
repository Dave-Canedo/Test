public class Ejercicio15 {
// Escribir una función que muestre un numero binario. La función debe recibir un número en sistema decimal y mostrarlo en binario.
    public static void main(String[] args) {
        int decimalNumber = 41;

        int binaryNumber = DecToBin(decimalNumber);
        
        System.out.println(decimalNumber+" equivale en el sistema binario a "+binaryNumber);
    }
    public static int DecToBin(int decNum) {
        int residuum = 0;
        int resultAccumulator = 0;
        int multiplicand = 1;

        while(decNum>0) {
            residuum = decNum%2;
            decNum = decNum/2;
            resultAccumulator += residuum*multiplicand;
            multiplicand = multiplicand*10;
        }
        return resultAccumulator;
    }
}
