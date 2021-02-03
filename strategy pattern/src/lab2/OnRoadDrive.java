package lab2;

public class OnRoadDrive implements DriveBehavior {

    private final FlatTerrain flatTerrain;

    public OnRoadDrive(FlatTerrain flatTerrain) {
        this.flatTerrain = flatTerrain;
    }

    @Override
    public void drive(Car car) {
        System.out.println(flatTerrain.driveEfficiency(car));
    }
}
