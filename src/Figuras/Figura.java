package Figuras;

public abstract class Figura implements Comparable<Figura>{

    abstract public double area();
    abstract public void printDimensiones();


    @Override
    public int compareTo(Figura o) {
        return (int)(this.area()-o.area());
    }

    public String toString() {
        return this.getClass().getSimpleName()+ " "+this.area();
    }
}
