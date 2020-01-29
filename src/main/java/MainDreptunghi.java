public class MainDreptunghi {
    public static void main(String[] args) {
        Dreptunghi dreptunghiA = new Dreptunghi( 20.0, 10.0);
        System.out.println("Aria obiectului A este:" + dreptunghiA.getArie());
        System.out.println("Perimetru obiectului A:" + dreptunghiA.getPerimetru());

        Dreptunghi dreptunghiB = new Dreptunghi( 40.0, 40);
        System.out.println("Diagonala obiectului B este:" + dreptunghiB.getDiagonaka());
    }
}
