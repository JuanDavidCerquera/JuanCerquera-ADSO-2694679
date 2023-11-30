import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        System.out.println("ingrese el radio del circulo");
        double radio = scan.nextDouble();
        classes fig = new classes();
        double resustado = fig.calcularRadioDelCirculo(radio);
        System.out.println("el area del circulo es " + resustado);
        System.out.println("--------------------------");
        tringulo triangulo = new tringulo();
        System.out.println("escriba la altura del triangulo");
        triangulo.altura = scan.nextDouble();
        System.out.println("escriba la base del triangulo");
        triangulo.altura = scan.nextDouble();
        double areatriangulo = triangulo.calcularAreaTriangulo();
        System.out.println("el area del triangulo es " + areatriangulo + "cm2");

    }
}
