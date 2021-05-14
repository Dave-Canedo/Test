public class Ejercicio2 {
    // Hacer una función que reciba un array de enteros y que retorne el mayor de todos los números ahí.
    
    static int maximumArray(int[] array) {
        
        int maximumNumber = 0;

        for(int i = 0; i<array.length; i++) {

            if(maximumNumber<=array[i]) { 
                maximumNumber = array[i];
            }
        }
        return maximumNumber;
    }
    public static void main(String[] args) {

        int[] myArray = {51, 42, 66, 21, 32, 14};

        int solution = maximumArray(myArray);

        System.out.println("el valor mayor introducido en el array fue: "+solution);
    }
}
