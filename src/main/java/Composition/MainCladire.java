package Composition;

public class MainCladire {
    public static void main(String[] args) {
        Cladire claditeA = new Cladire("CBC");
        claditeA.getCamera().setMarime(100);
        claditeA.getCamera().setCuloare("rosu");
        System.out.println(claditeA.getNume() + "are o camera de culoare:" + claditeA.getCamera().getCuloare());
    }
}
