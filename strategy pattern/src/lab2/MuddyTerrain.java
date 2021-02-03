package lab2;


public class MuddyTerrain extends Terrain{

    public MuddyTerrain(double normalForce) {
        super(normalForce);
    }

    @Override
    public String driveEfficiency(Car c) {
        double utraction = usableTraction(c);
        if(utraction  >= 0.8) {
            return "A";
        } else if (utraction < 0.8 && utraction >= 0.6) {
            return "B";
        } else if (utraction < 0.6 && utraction >= 0.4) {
            return "C";
        } else {
            return "D";
        }
    }

}
