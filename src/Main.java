import Figuras.*;

public class Main {
    public static void main(String[] args){

        Rectangulo r = new Rectangulo(10.0,15.0);
        Cuadrado cu = new Cuadrado(10.0);
        Triangulo t = new Triangulo(10,5);
        Circulo c = new Circulo(6);

        r.printDimensiones();
        System.out.println(r.area()+"\n");

        cu.printDimensiones();
        System.out.println(cu.area()+"\n");

        t.printDimensiones();
        System.out.println(t.area()+"\n");

        c.printDimensiones();
        System.out.println(c.area()+"\n");


        Figura[] vectorFiguras = new Figura[]{r,cu,t,c};
        GestorFiguras gf = new GestorFiguras();
        System.out.println(gf.suma(vectorFiguras));

    }
}
