import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        double num1, num2, respuesta;
        int proceso, elegir;
        calculadora result = new calculadora();
        do {
            System.out.println("escribe el valor uno y valor dos");
            num1 = scan.nextDouble();
            num2 = scan.nextDouble();
            System.out.println("elige la operacion deseada ");
            System.out.println("1. suma");
            System.out.println("2. resta");
            System.out.println("3. multiplicacion");
            System.out.println("4. division");
            System.out.println("5. potencia");
            System.out.println("6. raiz");

            proceso = scan.nextInt();

            switch (proceso) {
                case 1:
                    respuesta = result.suma(num1, num2);
                    System.out.println("el resultado de la suma es " + respuesta);
                    break;
                case 2:
                    respuesta = result.resta(num1, num2);
                    System.out.println("el resultado de la resta es " + respuesta);
                    break;
                case 3:
                    respuesta = result.multiplicacion(num1, num2);
                    System.out.println("el resultado de la multiplicacion es " + respuesta);
                    break;
                case 4:
                    respuesta = result.division(num1, num2);
                    System.out.println("el resultado de la division es " + respuesta);
                    break;
                case 5:
                    respuesta = result.potencia(num1, num2);
                    System.out.println("el resultado de la potencia es " + respuesta);
                    break;
                case 6:
                    respuesta = result.raiz(num1, num2);
                    System.out.println("el resultado de la raiz es " + respuesta);
                    break;
                default:
                    System.out.println("no es valida esa operacion");
                    break;
            }
            System.out.println("desea continuar?");
            System.out.println("1. si");
            System.out.println("2. no");
            elegir = scan.nextInt();
        } while (elegir == 1);

        scan.close();
    }
}
