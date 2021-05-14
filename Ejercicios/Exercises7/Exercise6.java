public class Exercise6 {
    // Crear un array bidimensional con datos y cambiar los valores en los bordes por 1 y los del interior por 0
    public static void main(String[] args) {
        int[][] zeroCentre = {{9, 18, 27}, {36, 45, 54}, {63, 72, 81}};

        for(int i = 0; i<zeroCentre.length; i++) {
            for(int j = 0; j<zeroCentre.length; j++) {
                if(i==1 && j==1) {
                    zeroCentre[i][j] = 0;
                    System.out.print(zeroCentre[i][j]+" ");
                } else {
                    zeroCentre[i][j] = 1;
                    System.out.print(zeroCentre[i][j]+" ");
                }
            }
            System.out.println("");
        }
    }
}
