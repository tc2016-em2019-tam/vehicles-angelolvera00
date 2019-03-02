package com.AngelOlvera;

public class PoliceCar extends Vehicle implements IEmergency, LandVehicle {
    private int numWheels;

    public PoliceCar(String name, int maxPassengers, double maxSpeed, int numWheels) {
        super(name, maxPassengers, maxSpeed);
        this.numWheels = numWheels;
    }

    public PoliceCar(String name, int numWheels) {
        super(name);
        this.numWheels = numWheels;
    }

    @Override
    public void SoundSiren() {
        System.out.println("Siren on: Wiu Wiu Wiu");
    }

    @Override
    public int getNumWheels() {
        return numWheels;
    }

    @Override
    public void setNumWheels(int numWheels) {
        this.numWheels=numWheels;
    }

    @Override
    public void drive() {
        System.out.println("Call drive() method");
    }
    public void turnpoliceradio(){
        System.out.println("Turning on police radio");
    }
}
