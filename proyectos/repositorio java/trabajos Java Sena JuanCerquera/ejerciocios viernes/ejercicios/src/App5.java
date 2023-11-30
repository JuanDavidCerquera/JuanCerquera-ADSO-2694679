import java.util.Scanner;

public class App5 {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        int[][] matriz = new int[5][5];
        int[] vector1 = new int[5];

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.println("escriba el valor deseado para esta ubicacion " + (i + 1) + " , " + (j + 1));
                matriz[i][j] = scan.nextInt();
            }
        }
        for (int i = 0; i < 5; i++) {
            System.out.println("");
            System.out.print("|");
            for (int j = 0; j < 5; j++) {
                System.out.print(matriz[i][j] + "|");
            }
        }
        System.out.println("");
        for (int i = 0; i < 5; i++) {
            vector1[i] = matriz[i][i];
            System.out.println(vector1[i]);
        }
        scan.close();
    }
}
