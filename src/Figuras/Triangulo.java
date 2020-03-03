package Figuras;

public class Triangulo extends Figura {

    private double b;
    private double h;

    public Triangulo (){
        this.b =0;
        this.h =0;
    }
    public Triangulo (double _b, double _h){
        this.b =_b;
        this.h =_h;
    }

    @Override
    public void printDimensiones(){
        System.out.println("Base: "+b+"\nAltura: "+h);
    }

    @Override
    public double area() {
        return b*h/2;
    }

}
