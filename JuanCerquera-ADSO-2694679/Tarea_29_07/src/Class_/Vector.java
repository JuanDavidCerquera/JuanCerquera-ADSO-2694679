package Class_;

public class Vector extends Lectura {
    Lectura leer = new Lectura();
    public double[] notas = new double[9999];

    public void leerNotas(int posicion) {
        for (int i = 0; i < posicion; i++) {
            System.out.println("escribe el valor de la nota:" + (i + 1));
            double valor = leer.Double();
            notas[i] = valor;
            System.out.println(notas[i]);
        }
    }

    public void leerNota2(int posicion) {

        System.out.println("escribe el valor de la nota:" + (posicion + 1));
        double valor = leer.Double();
        notas[posicion] = valor;
        System.out.println(notas[posicion]);

    }

    public void escribirNotas(int posicion) {
        System.out.print("notas[");
        for (int i = 0; i < posicion; i++) {
            if (i != 0) {
                System.out.print(",");
            }
            System.out.print(notas[i]);
        }
        System.out.println("]");
    }

    public void mostrarParesImpares(int posicion) {
        int pares = 0, impares = 0;
        for (int i = 0; i < posicion; i++) {
            if (notas[i] % 2 == 0) {
                pares++;
            } else {
                impares++;
            }
        }
        System.out.println("la cantidad de numeros pares es: " + pares);
        System.out.println("la cantidad de numeros impares es: " + impares);
    }

    public void mostrarPositivosCerosNegativos(int posicion) {
        int positivos = 0, negativos = 0, ceros = 0;
        for (int i = 0; i < posicion; i++) {
            if (notas[i] == 0) {
                ceros++;
            } else if (notas[i] > 0) {
                positivos++;
            } else {
                negativos++;
            }
        }
        System.out.println("la cantidad de numeros ceros es: " + ceros);
        System.out.println("la cantidad de numeros negativos es: " + negativos);
        System.out.println("la cantidad de numeros positivos es: " + positivos);
    }

    public void mostrarMaxMin(int posicion) {
        double max = 0, min = 0;
        for (int i = 0; i < posicion; i++) {
            if (notas[i] < min) {
                min = notas[i];

            }
            if (notas[i] > max)
                max = notas[i];
        }
        System.out.println("el numero mas alto es: " + max);
        System.out.println("el numero mas bajo es: " + min);
    }
}
