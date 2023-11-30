public class calculadora {
    public double num1;
    public double num2;

    public double suma(double num1, double num2) {
        double resultado = num1 + num2;
        return resultado;
    }

    public double resta(double num1, double num2) {
        double resultado = num1 - num2;
        return resultado;
    }

    public double multiplicacion(double num1, double num2) {
        double resultado = num1 * num2;
        return resultado;
    }

    public double division(double num1, double num2) {
        double resultado = num1 / num2;
        return resultado;
    }

    public double potencia(double num1, double num2) {
        double resultado = Math.pow(num1, num2);
        return resultado;
    }

    public double raiz(double num1, double num2) {
        double resultado = Math.pow(num1, 1.0 / num2);
        return resultado;
    }
}
