package Class_;

public class CLass1_3_10 extends ClaseAbstracta {
    // 1.3.10. Leer un entero e imprimir si el número está dentro del rango 200-300
    // y si es asi imprimir si es par o impar.
    @Override
    public void Condicional() {
        if (numero >= 200 & numero <= 300) {
            System.out.println("el numero:" + numero + " esta en el rango de 200 y 300");
            if (numero % 2 == 0) {
                System.out.println("el numero es par");
            } else {
                System.out.println("el numero es impar");
            }
        } else {
            System.out.println("el numero:" + numero + " no esta en el rango de 200 y 300\"/\"");
        }
    }
}
