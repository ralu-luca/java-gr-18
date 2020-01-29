package aggregation;

public class MainMasina {
    public static void main(String[] args){
        //masina wv de culoare alba
        Motor motorWV = new Motor();
        motorWV.setPutere(1);
        motorWV.setPutere(75);

        System.out.println("MotorWV are puterea:" + motorWV.getPutere());
        System.out.println("MotorWV are capacitatea:" + motorWV.getCapacitate());

        Masina masinaWV = new Masina(motorWV, "WV");
        masinaWV.setCuloare("alb");

        System.out.println("Masina " + masinaWV.getNume() + "are culoare" + masinaWV.getCuloare() + "si motorul de " +
                "putere" + masinaWV.getMotor().getPutere() + "si capacitate:" + masinaWV.getMotor().getCapacitate());
    }
}
