package Composition;

public class Cladire {
    private String nume;
    private Camera camera;

    public Cladire(String name){
        this.nume = nume;
        this.camera = new Camera();

    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public Camera getCamera() {
        return camera;
    }

    public void setCuloareCamera(Camera camera) {
        this.camera = camera;
    }
}
