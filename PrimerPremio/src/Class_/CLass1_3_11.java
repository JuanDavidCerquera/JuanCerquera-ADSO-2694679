package Class_;

public class CLass1_3_11 extends ClaseAbstracta {
    // 1.3.11. Leer dos números e imprimir cuál de los dos números es mayor y cual
    // es menor.

    int numero2;

    @Override
    public void Lectura() {
        System.out.println("escriba el numero 1:");
        numero = sc.nextInt();
        System.out.println("escriba el numero 2:");
        numero2 = sc.nextInt();
    }

    @Override
    public void Condicional() {
        if (numero < numero2) {
            System.out.println(+numero2 + " es mayor que " + numero);
        } else {
            System.out.println(+numero + " es mayor que " + numero2);
        }

    }

}
