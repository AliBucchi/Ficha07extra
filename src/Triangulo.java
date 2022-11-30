public class Triangulo extends Figura {

    double base, altura;

    public Triangulo () { }

    public Triangulo (double base, double altura, String cor) {
        this.base = base;
        this.altura = altura;
        this.cor = cor;
    }

    public void setBase () {
        this.base = base;
    }

    public double getBase (double base) {
        return base;
    }

    public void setAltura () {
        this.altura = altura;
    }

    public double getAltura (double altura) {
        return altura;
    }

    public double area () {
        return base * altura / 2;
    }

    @Override
    public String toString() {
        return "Triangulo{" +
                "base=" + base +
                '}';
    }
}
