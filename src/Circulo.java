import java.lang.Math;

public class Circulo extends Figura {

    double raio;

    public Circulo() { }

    public Circulo (double raio, String cor) {
        this.raio =  raio;
        this.cor = cor;
    }

    public void setRaio (double raio) {
        this.raio = raio;
    }

    public double getRaio () {
        return raio;
    }

    public double area() {
        return 2 * Math.PI * Math.pow(raio, 2);
    }

    public double getDiametro () {
        return 2 * raio;
    }

    public String toString() {
        return "o raio do circulo: " + raio;
    }
}
