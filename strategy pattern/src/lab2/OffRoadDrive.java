package lab2;

public class OffRoadDrive implements DriveBehavior {

    private final MuddyTerrain muddyTerrain;

    public OffRoadDrive(MuddyTerrain muddyTerrain) {
        this.muddyTerrain = muddyTerrain;
    }

    @Override
    public void drive(Car car) {
        System.out.println(muddyTerrain.driveEfficiency(car));
    }
}
