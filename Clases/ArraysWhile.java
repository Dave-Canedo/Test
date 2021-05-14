package Clases;

public class ArraysWhile {
    public static void main(String[] args) {
        int[] myArray = new int[3];
        // Arreglo o Array se puede guardar mas de un dato, en este caso 3 
        
        myArray[0] = 5;
        myArray[1] = 3;
        myArray[2] = 7;

         // en caso vde que se tenga varios datos para introcir,  se puede  pueutlizar un bucle, en este caso while
        
        int a = 0;
        while(a<3) {
            myArray[a]= myArray[a]*=2;  
            System.out.println("la posicion 0 tiene el valor "+myArray[a]);
            a++;
        }

    }
}
