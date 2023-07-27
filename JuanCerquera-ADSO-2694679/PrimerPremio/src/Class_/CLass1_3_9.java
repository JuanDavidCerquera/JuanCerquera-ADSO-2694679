package Class_;

public class CLass1_3_9 extends ClaseAbstracta {
    // 1.3.9. Leer un entero e imprimir si el números par o impar y si es positivo o
    // no.

    @Override
    public void Lectura() {
        System.out.println("escriba el numero");
        numero = (sc.nextInt());
    }

    @Override
    public void Condicional() {

        if (numero % 2 == 0) {
            System.out.println("el numero es par");
        } else {
            System.out.println("el numero es impar");
        }
        if (numero < 0) {
            System.out.println("el numero es negativo");

        } else if (numero > 0) {
            System.out.println("el numero es positivo");
        } else {
            System.out.println("el numero es cero");
        }
    }

}
