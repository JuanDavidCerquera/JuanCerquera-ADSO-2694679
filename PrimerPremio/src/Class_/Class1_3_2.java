package Class_;

public class Class1_3_2 extends ClaseAbstracta {

    @Override
    public void Lectura() {
        System.out.println("escriba el numero");
        numero = (sc.nextInt());
    }

    public void Condicional() {

        if (numero > 5) {
            System.out.println("el numero:" + numero + " es mayor a: 5");
        } else {
            System.out.println("el numero:" + numero + " es menor a: 5");
        }
    }
}
