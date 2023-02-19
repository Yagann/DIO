public class Main {
    public static void main(String[] args) {
        //Quadrilátero
        System.out.println("Exercício quadrilátero");

        double areaQuadrado = QuadrilateroAvancado.area(3);
        System.out.println("Área do quadrado: " + areaQuadrado);

        double areaRetangulo = QuadrilateroAvancado.area(5, 5);
        System.out.println("Área do retângulo: " + areaRetangulo);

        double areaTrapezio = QuadrilateroAvancado.area(3);
        System.out.println("Área do trapézio: " + areaTrapezio);

    }
    
}
