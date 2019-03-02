package com.AngelOlvera;

import java.util.LinkedList;


public class Main {

    public static void main(String[] args) {

        Vehicle[] myArray = new Vehicle[5];

        myArray[0] = new Jeep("Fred's Jeep", 4);
        myArray[1] = new Jeep("Frank's Jeep", 4);
        myArray[2] = new Hovercraft("Sue's Hover-craft", 4, 0.0);
        myArray[3] = new Frigate("Money Waster", 0.0);
        myArray[4] = new PoliceCar("Ghost Rider", 4, 20.5, 4);

        LinkedList<Vehicle> myVehicles = new LinkedList<Vehicle>();
        myVehicles.add(new Jeep("Fred's Jeep", 4));
        myVehicles.add(new Jeep("Frank's Jeep", 4));
        myVehicles.add(new Hovercraft("Sue's Hover-craft", 4, 0.0));
        myVehicles.add(new Frigate("Money Waster", 0.0));
        myVehicles.add(new PoliceCar("Ghost Rider", 4, 20.5, 4));

        for (int i = 0; i < myArray.length; i++) {

            System.out.println(myArray[i].getName());

            if (myArray[i] instanceof LandVehicle) {
                LandVehicle lv = (LandVehicle) myArray[i];
                lv.drive();
            }
            if (myArray[i] instanceof IEmergency) {
                IEmergency ie = (IEmergency) myArray[i];
                ie.SoundSiren();
            }

        }
        System.out.println("__________________________________");

        for (int i=0; i< myVehicles.size(); i++){

            System.out.println(myVehicles.get(i).getName());

            if(myVehicles.get(i) instanceof LandVehicle){
                LandVehicle lv= (LandVehicle) myVehicles.get(i);
                lv.drive();
            }
            if (myVehicles.get(i)instanceof IEmergency){
                IEmergency ie = (IEmergency) myVehicles.get(i);
                ie.SoundSiren();
            }
        }

    }
}

