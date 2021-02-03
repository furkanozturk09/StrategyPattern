package lab2;

public abstract class Terrain {

    protected double normalForce; //Minimum required force needed to move on the surface

    public Terrain(double normalForce) {
        this.normalForce = normalForce;
    }

    protected double usableTraction(Car c) {
        return (((2*Math.PI*c.getEngineTorque())/(2*Math.PI*c.getWheelRadius()))/c.getWeight())*normalForce;
    }

    public abstract String driveEfficiency(Car car);

}
