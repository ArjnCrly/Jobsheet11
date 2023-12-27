import java.util.Scanner;

public class NestedLoop_2341720156 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Double[][] array = new Double[5][7];

        for (int i = 0; i < array.length; i++) {
            System.out.println("Kota ke-" + i+1);
            for (int j = 0; j < array[0].length; j++) {
                System.out.print("Hari ke-" + (j+1) + ": ");
                array[i][j] = scan.nextDouble();
            }
            System.out.println();

            int i = 1;
            for (Double[] row : array) {
                Double totalSuhu = 0;
                System.out.print("Kota ke-" + i++ + ": ");
                for (Double element : row) {
                    System.out.print(element + " ");
                    totalSuhu += element;
                }
                System.out.println();
                System.out.printf("Rata - rata suhu kota ke-%d: %.2f", i-1, totalSuhu / row.length);
                System.out.println();
            }
        }
    }   
}
