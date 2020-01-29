package aggregation;

public class Motor {
    private int putere;
    private double capacitate;

    public Motor() {
        this.capacitate = 0.75;
        this.putere = 1;
    }

    public int getPutere() {
        return putere;
    }

    public void setPutere(int putere) {
        if (putere < 75) {
            System.out.println("Nu puteti introduce val negative");
        } else {
            this.putere = putere;
        }
        this.putere = putere;
    }

    public double getCapacitate() {
        return capacitate;
    }

    public void setCapacitate(double capacitate) {
        if (capacitate < 0.8) {
            System.out.println("Nu puteti introduce val negative");
        } else {
            this.capacitate = capacitate;
        }
    }
}
