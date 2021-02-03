package lab2;

public class RallyCar extends Car {

    public RallyCar(double weight, double engineTorque, double wheelRadius, DriveBehavior driveBehavior) {
        super(weight, engineTorque, wheelRadius, driveBehavior);
    }

    @Override
    public String carType() {
        return "Rally Car";
    }

    @Override
    public void performDrive() {
        super.driveBehavior.drive(this);
    }
}
