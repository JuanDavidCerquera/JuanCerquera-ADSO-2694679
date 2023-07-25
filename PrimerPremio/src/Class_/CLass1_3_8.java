package Class_;

public class CLass1_3_8 extends ClaseAbstracta {
    // imprimir si el número es par o impar.

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
    }
}
