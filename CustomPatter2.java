
import java.util.Scanner;

class CustomPattern2{

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a value n");
        int n = sc.nextInt();

        for (int i=1;i<=n;i++) {
            for (int j=1;j<=2*n-1;j++){
                if (i>=j || i+j>=2*n) 
                    System.out.print("*"+" ");
               else
                    System.out.print(" "+" ");

                }
           
            System.out.println();
        }
        sc.close();
       }
    }



