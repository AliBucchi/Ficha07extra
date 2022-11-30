public class Principal {

    public static void main(String[] args) {
        Figura obj1, obj2, obj3, obj4;

        obj1 = new Retangulo (3, 4, "azul");
        obj2 = new Quadrado (4, "rosa");
        obj3 = new Triangulo (4, 4, "roxo");
        obj4 = new Circulo (4, "lilas");

        System.out.println("Area do retangulo é: " + ((Retangulo) obj1).area());
        System.out.println();
    }
}
