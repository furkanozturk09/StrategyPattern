package lab2;

public class FlatTerrain extends Terrain {


    public FlatTerrain(double normalForce) {
        super(normalForce);
    }

    @Override
    public String driveEfficiency(Car car) {
        double utraction = usableTraction(car);
        if(utraction  >= 0.6) {
            return "A";
        } else if (utraction < 0.6 && utraction >= 0.4) {
            return "B";
        } else if (utraction < 0.4 && utraction >= 0.2) {
            return "C";
        } else {
            return "D";
        }
    }
}
