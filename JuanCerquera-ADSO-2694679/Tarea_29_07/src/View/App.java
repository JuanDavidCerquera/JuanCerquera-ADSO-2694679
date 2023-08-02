package View;

import Class_.Lectura;
import Class_.Vector;

public class App {
    public static void main(String[] args) throws Exception {

        Lectura leer = new Lectura();
        Vector vector = new Vector();
        int limite = 0;
        int ya;

        // System.out.println("escribe cuantas notas quieres poner");
        // int limite = leer.Entero();

        // vector.leerNotas(limite);
        do {
            vector.leerNota2(limite);
            System.out.println("escribe cero si no quieres poner otra nota");
            System.out.println("de lo contrario escriba cualquier numero");
            ya = leer.Entero();
            limite++;
        } while (ya != 0);
        vector.escribirNotas(limite);
        vector.mostrarMaxMin(limite);
        vector.mostrarParesImpares(limite);
        vector.mostrarPositivosCerosNegativos(limite);

    }
}
