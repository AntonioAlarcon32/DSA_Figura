package Figuras;

public class Rectangulo extends Figura {

    static double l1;
    static double l2;

    public Rectangulo (){
        this.l1 =0;
        this.l2 =0;
    }
    public Rectangulo (double _l1, double _l2){
        this.l1 =_l1;
        this.l2 =_l2;
    }

    public void printDimensiones(){
        System.out.print(l1+" x "+l2+"\n");
    }

}
