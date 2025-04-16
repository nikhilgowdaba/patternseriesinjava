
import java.util.Scanner;

class row3coloum31 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a row value");
        int row = sc.nextInt();
        System.out.println("enter a coloum value");
        int coloum = sc.nextInt();
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= coloum; j++) {
                if (i == j) {
                    System.out.print("*" + "  ");
                } else {
                    System.out.print("  " + "  ");
                }
            }

            System.out.println();
        }
    }
 
}
