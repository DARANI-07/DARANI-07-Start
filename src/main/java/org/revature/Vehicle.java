package org.revature;

public class Vehicle {
    private int currentSpeed;
    private String make;
    private String model;

    // Constructor (optional but good practice)
    public Vehicle(String make, String model) {
        this.make = make;
        this.model = model;
        this.currentSpeed = 0;
    }

    public int accelerate() {
        currentSpeed += 5;
        return currentSpeed;
    }

    public String honk() {
        return "HONNNK";
    }

    // Getters for private fields (if portal checks variables)
    public int getCurrentSpeed() {
        return currentSpeed;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }
}
