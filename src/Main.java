import Figuras.*;

public class Main {
    public static void main(String[] args){

        Rectangulo R = new Rectangulo(10.0,15.0);
        R.printDimensiones();

        Cuadrado C = new Cuadrado(10.0);
        C.printDimensiones();
    }
}
