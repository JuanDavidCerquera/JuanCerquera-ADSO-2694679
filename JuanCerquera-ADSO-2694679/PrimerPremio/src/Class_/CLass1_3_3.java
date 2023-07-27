package Class_;

public class CLass1_3_3 extends ClaseAbstracta {
    // imprimir si su cuadrado es mayor a 5000.

    @Override
    public void Lectura() {
        System.out.println("escriba el numero");
        numero = (sc.nextInt());
    }

    @Override
    public void Condicional() {

        if (Math.pow(numero, 2) > 5000) {
            System.out.println("el cuadrado del numero:" + numero + " es mayor a: 5000");
        } else {
            System.out.println("el cuadrado del numero:" + numero + " es menor a: 5000");

        }
    }
}
