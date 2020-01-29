public class Dreptunghi {
    private double lungime;
    private double latime;

    public Dreptunghi(double lungime, double latime) {
        this.latime = latime;
        this.lungime = latime;
    }

    public double getArie(){
        return lungime * latime;
    }

    public double getPerimetru(){
        return  2 * (lungime * latime);
    }
    public double getDiagonaka(){
        return Math.sqrt(lungime * lungime + latime * latime);
    }
}
