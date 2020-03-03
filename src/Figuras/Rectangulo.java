package Figuras;

public class Rectangulo extends Figura {

    private double l1;
    private double l2;

    public Rectangulo (){
        this.l1 =0;
        this.l2 =0;
    }
    public Rectangulo (double _l1, double _l2){
        this.l1 =_l1;
        this.l2 =_l2;
    }

    @Override
    public void printDimensiones(){
        System.out.println(l1+" x "+l2);
    }

    @Override
    public double area() {
        return this.l1*this.l2;
    }
}
