package Class_;

public class CLass1_3_6 extends ClaseAbstracta {
    // imprimir si el número es mayor a 200 o no.

    @Override
    public void Lectura() {
        System.out.println("escriba el numero");
        numero = (sc.nextInt());
    }

    @Override
    public void Condicional() {

        if (numero > 200) {
            System.out.println("el numero:" + numero + " es mayor a: 200");
        } else {
            System.out.println("el numero:" + numero + " es menor a: 200");
        }
    }
}