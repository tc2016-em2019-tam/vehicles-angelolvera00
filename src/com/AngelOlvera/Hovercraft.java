package com.AngelOlvera;

public class Hovercraft extends Vehicle implements SeaVehicle, LandVehicle {
    private int numWheels;
    private double Displacement;

    public Hovercraft(String name, int numWheels,int maxPassengers,  double maxSpeed, double displacement) {
        super(name, maxPassengers, maxSpeed);
        this.numWheels = numWheels;
        Displacement = displacement;
    }
    public Hovercraft(String name, int numWheels, double displacement) {
        super(name);
        this.numWheels = numWheels;
        Displacement = displacement;
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
        System.out.println("Calling launch() method");
    }

    public void enterLand(){
        System.out.println("Entering Land");
    }
    public void enterSea(){
        System.out.println("Entering Sea");
    }
}