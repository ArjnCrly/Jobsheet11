import java.util.Scanner;
/**
 * Square
 */
public class Square {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Masukkan nilai n = ");
        int N = scan.nextInt();

        for(int iOuter=1; iOuter<=N; iOuter++){
            for(int i=1; i<=N; i++){
            System.out.print("*");
        }
        System.out.println();
        }
    }
}