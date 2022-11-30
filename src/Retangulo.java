public class Retangulo extends Figura {

    protected double lado1, lado2;

    public Retangulo() { }

    public Retangulo (double lado1, double lado2, String cor) {
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.cor = cor;
    }

    public void setLado1 (double lado1) {
        this.lado1 = lado1;
    }
    public double getLado1() {
        return lado1;
    }
    public void setLado2 (double lado2) {
        this.lado2 = lado2;
    }
    public double getLado2 () {
        return lado2;
    }

    public double area() {
        return lado1 * lado2;
    }

    public String toString() {
        return "o lado1 é: " + lado1;
    }



}
