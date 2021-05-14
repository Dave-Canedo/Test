public class Ejercicio9 {
    public static void main(String[] args) {
        int number1 = 10;
        int number2 = 84;
        int number3 = 14;

        System.out.println(findMCD(number1, number2, number3));
    }
    public static int findMCD(int n1, int n2, int n3) {
        int minorNumber = 0;
        int mcd = 0;

        if(n1<=n2 && n1<=n3) {
            minorNumber = n1;
        } else if(n2<=n1 && n2<=n3) {
            minorNumber = n2;
        } else if(n3<=n1 && n3<=n2) {
            minorNumber = n3;
        }
        while(minorNumber>0) {
            if(n1%minorNumber==0 && n2%minorNumber==0 && n3%minorNumber==0) {
                mcd = minorNumber;
                break;
            }
            minorNumber--;
        }
        return mcd;
    }
}