package Class_;

public class CLass1_3_4 extends ClaseAbstracta {

    // imprimir su valor absoluto.

    @Override
    public void Lectura() {
        System.out.println("escriba el numero");
        numero = (sc.nextInt());
    }

    @Override
    public void Condicional() {
        if (numero < 0) {
            numero = (numero * (-1));
            System.out.println("el valor absoluto es: " + numero);
        } else {
            System.out.println("el valor absoluto es: " + numero);
        }
    }
}
