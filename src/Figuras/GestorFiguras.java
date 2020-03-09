package Figuras;

import java.util.Arrays;

public class GestorFiguras {

    public double suma(Figura[] figuras){
        double total=0;
        for (Figura f:figuras) {
            total+=f.area();
        }
        return total;
    }

    public void sort(Figura[] figuras){
        Arrays.sort(figuras);
//        return 0.0;//PROVISIONAL
    }

}
