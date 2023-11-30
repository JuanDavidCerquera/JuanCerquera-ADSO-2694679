import java.util.Scanner;

public class App1 {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        int suma = 0;
        int[][] matriz = new int[2][3];

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("escriba el valor deseado para esta ubicacion " + (i + 1) + " , " + (j + 1));
                matriz[i][j] = scan.nextInt();
                suma = suma + matriz[i][j];
            }
        }
        System.out.println(suma);
        scan.close();
    }
}
