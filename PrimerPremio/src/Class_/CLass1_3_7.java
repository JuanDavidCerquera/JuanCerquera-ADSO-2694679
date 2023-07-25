package Class_;

public class CLass1_3_7 extends ClaseAbstracta {
    // imprimir si el número está en el rango de 50 y 100.

    @Override
    public void Lectura() {
        System.out.println("escriba el numero");
        numero = (sc.nextInt());
    }

    public void Condicional() {
        if (numero >= 50 & numero <= 100) {
            System.out.println("el numero:" + numero + " esta en el rango de 50 y 100");
        } else {
            System.out.println("el numero:" + numero + " no esta en el rango de 50 y 100");
        }
    }
}
