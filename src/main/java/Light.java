public class Light {
    // attributes
    public static final int MAX = 100;
    public static final int MIN = 0;
    private int step;
    private  int intesitateaCurenta;

    //constructor
    public Light(int step){
        this.step = step;
        this.intesitateaCurenta = 0;
    }
    //methods
    public void on(){
        System.out.println("Intensitatea becului este:" + MAX);
        this.intesitateaCurenta = MAX;
    }

    public void off(){
        System.out.println("Becul este stins");
        this.intesitateaCurenta = MIN;
    }

    public void brighten(){
     if (intesitateaCurenta + step < MAX){
        intesitateaCurenta = intesitateaCurenta + step;
        System.out.println("Intensitatea curenta a becului este: " + intesitateaCurenta);
     }else{
         System.out.println("Nu se mai poate creste intensitatea");
     }
    }

    public void dimen(){
     if (intesitateaCurenta - step > MIN){
         intesitateaCurenta = intesitateaCurenta - step;
     }else{
         System.out.println("Intensitatea curenta a becului este: " + intesitateaCurenta);
         System.out.println("Intensitatea mai poate creste");
     }
    }
}
