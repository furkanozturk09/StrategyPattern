package lab2;

/*
* In this example you are given;
* - DriveBehavior interface
* - Car abstract class
* - Terrain abstract class
* - MuddyTerrain and FlatTerrain classes that describes the type of the road.
*
* You are expected to implement two types of drive behavior; OnRoadDrive and OffRoadDrive.
*
* - OnRoadDrive and OffRoadDrive should use traction method of the corresponding Terrains and print returned letter
* A, B, C, D on the console screen.
*
* You are NOT allowed to alter DriveBehavior, Car, Terrain, MuddyTerrain, and FlatTerrain classes.
*
* */

public class Lab2 {

    public static void main(String[] args) {

        FlatTerrain flatTerrain = new FlatTerrain(500);
        OnRoadDrive onRoadDrive = new OnRoadDrive(flatTerrain);

        MuddyTerrain muddyTerrain = new MuddyTerrain(1500);
        OffRoadDrive offRoadDrive = new OffRoadDrive(muddyTerrain);

        RallyCar rallyCar = new RallyCar(1190000, 425, 0.649, offRoadDrive);
        System.out.print("Drive class for muddy road ");
        rallyCar.performDrive();

        rallyCar.driveBehavior = onRoadDrive;
        System.out.print("Drive class for flat road ");
        rallyCar.performDrive();

    }

}
