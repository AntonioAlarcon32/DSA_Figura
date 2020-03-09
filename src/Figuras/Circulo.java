package Figuras;

public class Circulo extends Figura {

    private double r;

    public Circulo (){
        this.r =0;
    }
    public Circulo (double _r){
        this.r =_r;
    }

    @Override
    public void printDimensiones(){
        System.out.println("Radio: "+r);
    }

    @Override
    public double area() {
        return Math.PI*Math.pow(r,2);
    }


}
