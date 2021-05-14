public class Exercise1 {
    // Crear una array bidimensional de tamaño 5x5 y rellenarla de la siguiente forma: la posicion arr[n, m] debe contener n +m. Despues mostrar su contenido.
   public static void main(String[] args) {
       int[][] arrayBidimensional = new int[5][5];

       for(int i = 0; i<arrayBidimensional.length; i++) { 
            for(int j = 0; j<arrayBidimensional.length; j++) { 
                arrayBidimensional[i][j] = i+j;
                System.out.print(arrayBidimensional[i][j]+", "); 
            }
            System.out.println("");
       }
   } 
}
