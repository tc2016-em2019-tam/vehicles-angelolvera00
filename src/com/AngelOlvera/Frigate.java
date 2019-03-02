package com.AngelOlvera;

public class Frigate extends Vehicle implements SeaVehicle {
    private double Displacement;

    public Frigate(String name, int maxPassengers, double maxSpeed, double displacement) {
        super(name, maxPassengers, maxSpeed);
        Displacement = displacement;
    }
    public Frigate(String name, double displacement) {
        super(name);
        Displacement = displacement;
    }
    @Override
    public double getDisplacement() {
        return Displacement;
    }

    @Override
    public void setDisplacement(double Displacement) {
        this.Displacement=Displacement;
    }

    @Override
    public void Launch() {
        System.out.println("Calling Launch method");
    }

    public void FireGun(){
        System.out.println("Fire! Fire!");
    }

}
