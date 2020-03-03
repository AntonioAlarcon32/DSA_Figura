package Figuras;

public class GestorFiguras {

    public double suma(Figura[] figuras){
        double total=0;
        for (Figura f:figuras) {
            total+=f.area();
        }
        return total;
    }

    public double sort(Figura[] F){
        return 0.0;//PROVISIONAL
    }

}
