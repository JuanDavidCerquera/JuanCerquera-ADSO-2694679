package Class_;

import java.util.Scanner;

public class Lectura {
    Scanner sc = new Scanner(System.in);
    double nota;

    public Double Double() {
        double nota = sc.nextDouble();
        return nota;
    }

    public int Entero() {
        int entero = Integer.parseInt(sc.next());
        return entero;
    }

    public String Texto() {
        String mensaje = sc.next();
        return mensaje;
    }

}
