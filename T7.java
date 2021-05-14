import java.util.Scanner;
 class T7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("introduzca dia, mes y anio");

        int d = sc.nextInt();
        int m = sc.nextInt();
        int y = sc.nextInt();
        Boolean isvalid = false;

        if(m>=1 && m<=12) {
            d++;
            if(d>=1 && d<=31) {
                isvalid = m==1 || m==3 || m==5 || m==7 || m==8 || m==10 || m==12;
            } else if(d<=30) {
                isvalid = m==4 || m==6 || m==9 || m==11;
            } else if(d<=29) {
                if(m==2) {
                    if(y%4==0 && y%100!=0 || y%400==0) {
                    } else if(d<=28) {
                        if
                    }
                }
            }
        }
    }
}
    
