package lab2;

public abstract class Car {

    private double weight;
    private double engineTorque;
    private double wheelRadius;
    protected DriveBehavior driveBehavior;

    public Car(double weight, double engineTorque, double wheelRadius, DriveBehavior driveBehavior) {
        this.weight = weight;
        this.engineTorque = engineTorque;
        this.wheelRadius = wheelRadius;
        this.driveBehavior = driveBehavior;
    }

    public abstract String carType();

    public double getWeight() {
        return weight;
    }

    public double getEngineTorque() {
        return engineTorque;
    }

    public double getWheelRadius() {
        return wheelRadius;
    }

    public abstract void performDrive();

}
