public class Ejercicio3 {
    // Hacer una función a la que se le pasen 2 enteros y que muestren todos los números entre ellos.
    static void rangoNumeros(int num1, int num2) {

         int numMayor;
         int numMenor;

         if(num1<num2) {
             numMayor = num2;
             numMenor = num1;
         } else {
             numMayor = num1;
             numMenor = num2;
         }

         for(int i = numMenor+1; i<numMayor; i++) {

             System.out.print(i+", ");
         }
    }
    public static void main(String[] args) {

        int number1 = 17;

        int number2 = 18;

        rangoNumeros(number1, number2);

    }
}