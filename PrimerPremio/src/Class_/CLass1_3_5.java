package Class_;

public class CLass1_3_5 extends ClaseAbstracta {
    // imprimir si el número es positivo o negativo.

    @Override
    public void Lectura() {
        System.out.println("escriba el numero");
        numero = (sc.nextInt());
    }

    @Override
    public void Condicional() {
        if (numero < 0) {
            System.out.println("el numero es negativo");

        } else if (numero > 0) {
            System.out.println("el numero es positivo");
        } else {
            System.out.println("el numero es cero");
        }
    }
}
