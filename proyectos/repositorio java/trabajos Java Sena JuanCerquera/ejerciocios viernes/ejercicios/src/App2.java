import java.util.Scanner;

public class App2 {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        int[][] matriz = new int[5][5];
        int[][] matriz2 = new int[1][1];
        int fila = 0, columna = 0;

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.println("escriba el valor deseado para esta ubicacion " + (i + 1) + " , " + (j + 1));
                matriz[i][j] = scan.nextInt();
            }
        }
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (matriz[i][j] > matriz2[0][0]) {
                    matriz2[0][0] = matriz[i][j];
                    fila = i + 1;
                    columna = j + 1;
                }
            }
        }
        System.out
                .println("el numero de mayor valor se encuentra en: la fila: " + fila + "  en la columna: " + columna);
        scan.close();
    }
}
