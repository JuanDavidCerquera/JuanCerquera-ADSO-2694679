public class tringulo {
    public double base;
    public double altura;

    public double calcularAreaTriangulo() {
        double area = (base * altura) / 2;
        return area;
        // para especificar que se usa una variable global se utilisa "this."
        // ejemplo this.base
    }
}
