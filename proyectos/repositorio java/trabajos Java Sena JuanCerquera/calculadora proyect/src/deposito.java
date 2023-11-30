public class deposito {
    public static void main(String[] args) {

        double p = 1000000, i = 0.025;

        for (int j = 0; j < 12; j++) {
            double cantidad = p * i;
            p = p + cantidad;
        }
        System.out.println("la cantidad que tendra al final de año sera de: " + p);

    }
}
